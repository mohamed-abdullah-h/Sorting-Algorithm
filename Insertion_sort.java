package Algorithms.sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] ints = {6,1,0,4,9,7,2,8,3};
        asc(ints);
        Arrays.stream(ints).forEach(System.out::println);
    }
    private static void asc(int[] items) {
        int l = items.length;
        for (int i = 1; i < l;i++) {
            int j = i-1; int k = items[i];
            while (j >= 0 && items[j] > k) {
                items[j+1] = items[j];
                j--;
            }
            items[j+1] = k;
        }

    }
}
