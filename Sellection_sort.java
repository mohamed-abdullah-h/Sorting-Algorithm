package Algorithms.sorting;

import java.util.Arrays;

public class Sellection_sort {
    public static void main(String[] args) {
        int [] ints = {6,1,0,4,9,7,2,8,3};
        asc(ints);
        Arrays.stream(ints).forEach(System.out::println);
    }
    static void asc (int [] ints) {
        int a = ints.length;
        int pionter = 0;
        for (int i = 0; i< a;i++) {
            pionter = i;
            int s = ints[i];
            for (int x = i+1; x < a;x++) {
                if (s > ints[x]) {
                    s = ints[x];
                    pionter = x;
                }
            }
            int anInt = ints[i];
            ints[i] = s;
            ints[pionter] = anInt;

        }
    }

}
