package com.dsa.sorting;

import java.util.Arrays;

public class MergeSortImpl {
    public static void main(String[] args) {
        int a[] = {8,5,2,9,4,7,1};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int low, int high) {
        if(low<high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    private static void merge(int[] a, int low, int mid, int high) {

        int n = mid-low+1;
        int m = high-mid;

        int[] LA = new int[n];
        int[] RA = new int[m];

        for(int i=0;i<n;i++){
            LA[i] = a[low+i];
        }

        for(int j=0;j<m;j++){
            RA[j] = a[mid+1+j];
        }


     int i=0,j=0,k=low;
        while(i<n && j<m){
            if(LA[i]<RA[j]){
                a[k] = LA[i];
                i++;
                k++;
            }else{
                a[k] = RA[j];
                j++;
                k++;
            }
        }

        while(i<n){
            a[k] = LA[i];
            i++;
            k++;
        }

        while(j<m){
            a[k] = RA[j];
            j++;
            k++;
        }
    }
}
