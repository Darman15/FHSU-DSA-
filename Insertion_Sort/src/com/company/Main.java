package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] insertionSortArr = {92,14,54,71,75,81,86};

        System.out.println(insertionSort(insertionSortArr));
    }

    public static int[] insertionSort(int[] arr) {
        int i = 0;
        int j = 0;
        int temp = 0;
        int compare = 0;

        for ( i = 1; i  < arr.length; i++ ) {
            j = i;
            System.out.println("i is pointing at " + arr[i]);
            System.out.println("j is pointing at " + arr[j]);
            System.out.println("The for loop has gone " + i  + " Times");

            while (j > 0 && arr[j] < arr[j - 1])  {
                System.out.println(arr[j] + " is swapping places with " + arr[j - 1]);
                temp = arr[j];
                arr[j] = arr[ j - 1];
                arr[j - 1] = temp;
                j--;
            }
            System.out.println("The array is now " + Arrays.toString(arr));
        }
        return arr;
    }

//    public static int[] insertionSortAsending(int[] arr) {
//        int i = 0;
//        int j = 0;
//        int temp = 0;
//        for ( i = 1; i  < arr.length; i++ ) {
//            j = i;
//            System.out.println("The i is pointed at " + arr[i]);
//            System.out.println("The j is pointed at " + arr[j]);
//        while(j >=0 && arr[j] < arr[j + 1]) {
//
//        }
//        }
//    }


}
