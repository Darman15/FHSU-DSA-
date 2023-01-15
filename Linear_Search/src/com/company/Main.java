package com.company;
import java.sql.SQLOutput;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] linearSearchArr = {6, 24, 16, 14, 5, 32, 63, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to look for in Array");

        int key = scanner.nextInt();
        System.out.println("The key is " + key);

        System.out.println(LinearSearch(linearSearchArr, key));


    }

    public static int LinearSearch (int[] arr, int key) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }

        }
        System.out.println("The key was not found in the array");
       return -1;
    }
}
