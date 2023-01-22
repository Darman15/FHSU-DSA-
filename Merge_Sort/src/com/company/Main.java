package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {67, 70, 63, 69, 75};

        System.out.println(Merge(arr, 0, 0, 1));
//        MergeSort(arr, 1, 2);



    }


//    The index variable i is the index of first element in the list, and the index variable k is the index of the last element.
//    J will act as teh midpoint



    public static void MergeSort(int[] arr, int i, int k) {
        int j = 0;
        System.out.println(" i is " + i);
        System.out.println("k is " + k);

        if(i < k) {
            j = (i + k) / 2;
            System.out.println("J is now " + j);
//            System.out.println("j is the number " + arr[j]);
            System.out.println(i);
            System.out.println(j);
            MergeSort(arr, i, j);
            System.out.println(j + 1);
            System.out.println(k);
            MergeSort(arr, j + 1, k);


            Merge(arr, i, j, k);
            System.out.println("The fully sorted array is " + Arrays.toString(Merge(arr, i, j, k)));
        }


    }



    public static int[] Merge(int[] arr, int leftFirst, int leftLast, int rightLast) {

        int mergedSize = rightLast - leftFirst + 1;
        int mergePos = 0;
        int leftPos = 0;
        int rightPos = 0;
        int[] mergedNumbers = new int[mergedSize];

        leftPos = leftFirst;
        rightPos = leftLast + 1;

        while (leftPos <= leftLast && rightPos <= rightLast) {
            System.out.println(mergePos + " is the mergepos");

            System.out.println(leftPos + " is the left pos");
            System.out.println(rightPos + "is the rightepos");
            if (arr[leftPos] <= arr[rightPos]) {
                mergedNumbers[mergePos] = arr[leftPos];
                System.out.println("The merged numbers 1 are " + Arrays.toString(mergedNumbers));
                ++leftPos;

            } else {
                mergedNumbers[mergePos] = arr[rightPos];
                System.out.println("The merged numbers 2 are " + Arrays.toString(mergedNumbers));
                ++rightPos;


            }
            mergePos++;
            System.out.println(mergePos + " is the mergePos");
            System.out.println(leftPos + " is the left pos");
            System.out.println(rightPos + "is the rightepos");
        }

            while (leftPos <= leftLast) {
                mergedNumbers[mergePos] = arr[leftPos];
                System.out.println("The merged numbers 3 are " + Arrays.toString(mergedNumbers));
                ++leftPos;
                ++mergePos;
                System.out.println(mergePos + " is the mergePos");
                System.out.println(leftPos + " is the left pos");
                System.out.println(rightPos + "is the rightepos");
            }

            while (rightPos <= rightLast) {
                mergedNumbers[mergePos] = arr[rightPos];
                System.out.println("The merged numbers 4 are " + Arrays.toString(mergedNumbers));
                rightPos++;
                System.out.println(rightPos + " is the righ pos");
                mergePos++;
                System.out.println(mergePos + " is the mergePos");
                System.out.println(leftPos + " is the left pos");
                System.out.println(rightPos + "is the rightepos");
            }
            for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
                arr[leftFirst + mergePos] = mergedNumbers[mergePos];
                System.out.println("The merged numbers 1 are " + Arrays.toString(mergedNumbers));
            }



        System.out.println(Arrays.toString(mergedNumbers));
        System.out.println("At the end of the merge the array is " + Arrays.toString(arr));
        return arr;
    }
}
