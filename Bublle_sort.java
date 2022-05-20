package Algorithms.sorting;

import java.util.Arrays;

public class Bublle_sort {
    public static void main(String[] args) {
        int [] ints = {6,1,0,4,9,7,2,8,3};
        asc(ints);
        Arrays.stream(ints).forEach(System.out::println);
    }

    private static void asc(int[] ints) {
        int s = ints.length;
        for (int i = 0;i< s;i++) {
            for (int x = 1; x<s;x++) {
                int a = ints[x];
                int b = ints[x-1];
                if (a < b) {
                    ints[x -1] = a;
                    ints[x] = b;
                }
            }
        }
    }
}
