package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSortImpl {

    public static void main(String[] args) {
        int a[] = {7, 3, 2, 9, 1, 4};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
