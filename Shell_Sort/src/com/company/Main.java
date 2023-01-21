package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] shellSortArr = {14, 85, 42, 11, 73, 39, 45, 67, 19, 50};
        int[] gapValuesArr = {3,2,1};

        System.out.println(shellSort(shellSortArr,  gapValuesArr));
    }


    public static int[] shellSort(int[] arr, int[] gapValues) {
        for (int gap:gapValues) {
            for (int i = 0; i < gap; i++) {
                shellSortInssertionInterveaved(arr, i, gap);
                System.out.println("the array after " + (i + 1) + " is " + Arrays.toString(shellSortInssertionInterveaved(arr, i, gap)));
            }
        }

        return arr;
    }



    public static int[] shellSortInssertionInterveaved(int[] arr, int startIndex,  int gap) {

        int i = 0;
        int j = 0;
        int temp = 0;
        int iterations = 1;

        for (i = startIndex + gap; i < arr.length; i = i + gap) {
            j = i;
            System.out.println("i is " + arr[i]);
            System.out.println("j is " + arr[j]);

            System.out.println("It has routed the for loop " + iterations + " Times");
            System.out.println(arr[j] + " is being compared to " + arr[j - gap]);
            while (j - gap >= startIndex && arr[j] < arr[j - gap ]) {
                System.out.println(arr[j] + " Is being swapped with " + arr[j - gap]);
                temp = arr[j];
                arr[j] = arr[j - gap];
                arr[ j - gap] = temp;
                j = j - gap;
                System.out.println("The array is now " + Arrays.toString(arr));
            }
            iterations++;
        }
        System.out.println("The arr after a full ShellSortInssertionInterveaned call is " + Arrays.toString(arr));
        return arr;
    }



}
