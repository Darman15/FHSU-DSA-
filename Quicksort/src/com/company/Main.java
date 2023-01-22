package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] quicksortArr = {16, 19, 43, 74, 71, 82, 91, 73};

//        System.out.println(Quicksort(quicksortArr, 0, quicksortArr.length - 1));
        System.out.println(Partition(quicksortArr, 3, 7));
    }


    public static int[] Quicksort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return arr;
        }

        int lowEndIndex = Partition(arr, lowIndex, highIndex);
        Quicksort(arr, lowIndex, lowEndIndex);
       arr =  Quicksort(arr, lowEndIndex + 1, highIndex);
        System.out.println("The array is now " + Arrays.toString( arr));
        return arr;
    }


    public static int Partition(int[] arr, int lowIndex, int highIndex) {
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        System.out.println("The midpoint for the partition is at index " + midpoint);
        int pivot = arr[midpoint];
        System.out.println("The pivot for the partition is the number " + pivot);
        int temp = 0;

        boolean done = false;

        while (!done) {
            while (arr[lowIndex] < pivot) {
                lowIndex += 1;
                System.out.println("The low index has incremented to " + lowIndex);
            }
            while (pivot < arr[highIndex]) {
                highIndex -= 1;
                System.out.println("The high index has decremented to " + highIndex);
            }
            if(lowIndex >= highIndex) {
                done = true;
            }

            else {
                System.out.println(arr[lowIndex] + "Is being swapped with " + arr[highIndex]);
                temp = arr[lowIndex];
                arr[lowIndex] = arr[highIndex];
                arr[highIndex] = temp;
                lowIndex += 1;
                highIndex -=1;
                System.out.println("The array in the partion method is now " + Arrays.toString(arr));
            }
        }
        System.out.println("THe array at the end of the partion method is " + Arrays.toString(arr));
        return highIndex;
    }
}
