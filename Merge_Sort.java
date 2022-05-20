package Algorithms.sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] ints = {6,1,0,4,9,7,15,5,11,2,8,3};
        devide(ints,0,ints.length);
        Arrays.stream(ints).forEach(System.out::println);
    }
    private static void devide(int [] arr,int from ,int to) {
        int le = to-from;
        if (le >= 2) {
            int mid = (le/2) + from;
            devide(arr,from,mid);
            devide(arr,mid,to);
            int [] arr1 = create_array(arr,from,mid);
            int [] arr2 = create_array(arr,mid,to);
            merge(arr,arr1,arr2,from,to);

        }
    }

    private static void merge(int[] arr, int[] arr1, int[] arr2, int from, int to) {
        int a1 = 0; int a2 = 0;
        while (to >= from) {
            if (a1 == arr1.length  || a2 == arr2.length )break;
            if (arr1[a1] < arr2[a2]) {
                arr[from++] = arr1[a1++];
            }
            else if(arr1[a1] > arr2[a2]) {
                arr[from++] = arr2[a2++];
            }
        }
        while (a1 < arr1.length) {
            arr[from++] = arr1[a1++];
        }
        while (a2 < arr2.length) {
            arr[from++] = arr2[a2++];
        }
    }

    private static int[] create_array(int[] arr, int mid, int to) {
        if (mid == to)return new int[]{mid};
        int le = to-mid;
        int[] ar = new int[le];
        for (int i = 0;i < le ;i++) {
            ar[i] = arr[mid+i];
        }
        return ar;
    }
}
