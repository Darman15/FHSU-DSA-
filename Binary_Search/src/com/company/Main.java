package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] binarySearch = {2, 4, 7, 10, 11, 32, 45, 87 };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to look for in the array");

        int key = scanner.nextInt();
        System.out.println("The key is " + key);

        binarySearch(binarySearch, key);
    }

    public static int binarySearch(int[] arr, int key) {

        int mid = 0;
        int low = 0;
        int high = arr.length - 1;

        System.out.println("The low it " + low);
        System.out.println("The number at low is " + arr[low]);
        System.out.println("The high is " + high);
        System.out.println("The number at high is " + arr[high]);

        while (high >= low) {
           mid = (high + low) / 2;
            System.out.println("The mid is " + mid);
            System.out.println("The mid number is " + arr[mid]);
            if(arr[mid] < key) {
                low = mid + 1;
                System.out.println("The low is " + low);
                System.out.println("The number at low is " + arr[low]);
            }
            else if (arr[mid] > key) {
                high = mid -1;
                System.out.println("The high is " + high);
                System.out.println("The number at high is " + arr[high]);
            }

            else return mid;
        }

        System.out.println("The number " + key + " was not found");
        return -1;
    }
}
