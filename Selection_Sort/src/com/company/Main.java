package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] selectionSortArr = {10,2,78,4,45,32,7,11};


        System.out.println(SelectionSort(selectionSortArr));



    }

    public static int[] SelectionSort(int[] arr) {

        int temp = 0;
        int smallestIndex = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println("The i index number is " + arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("The j index number is " + arr[j]);
                if (arr[j] < arr[i]) {
                    System.out.println(arr[j] + " Is going to be swapped with " + arr[i] + ".");
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("The array is now " + Arrays.toString(arr) + "After iterating " + i + " times.");
                }
            }
        }
        return arr;
    }
}
