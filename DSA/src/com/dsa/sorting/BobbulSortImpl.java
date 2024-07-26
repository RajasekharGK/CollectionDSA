package com.dsa.sorting;

import java.util.Arrays;

public class BobbulSortImpl {

    public static void main(String[] args) {
        int a[] = {6,1,5,12,17,7};
        int a1[] = {1,2,3,4,5,6};
        bobbulSort(a1);
        System.out.println(Arrays.toString(a1));
    }

   static void bobbulSort(int a[]) {
       boolean swapped ;
       for (int i = 0; i < a.length; i++) {
           swapped = false;
           for (int j = 0; j < a.length - 1; j++) {
               if (a[j] > a[j + 1]) {
                   int temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
                   swapped = true;
               }
           }

           if (!swapped) {
               break;
           }
       }

   }
   }



