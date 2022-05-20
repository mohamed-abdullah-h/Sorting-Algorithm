package Algorithms.sorting;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int [] ints = {20,6,1,0,4,9,7,15,5,11,2,8,3};
        sort(ints,0,ints.length);
        Arrays.stream(ints).forEach(System.out::println);
    }

    private static void sort(int[] ints,int f,int end) {

        int l = end-f;
        if (l<=1) return;
        int pivot = ints[f];
        int j = l-1 + f;
        int p = f;
        int c = j;
        for (int i = 0; i < l; i++) {

            if (ints[p] > ints[j]) {
                if (ints[p] == pivot) {
                    ints[p] = ints[j];
                    ints[j] = pivot;
                    ++p;
                }
                else {
                    ints[j] = ints[p];
                    ints[p] = pivot;
                    --j;
                }

            }
            else {
                if (ints[p] == pivot)--j;
                else ++p;
            }
            if (p == j)break;
        }
        if (ints[p] == pivot) c = p;
        else c = j;
        if (c == f) c =f+1;
        sort(ints,f,c);
        sort(ints,c,end);
    }

}
