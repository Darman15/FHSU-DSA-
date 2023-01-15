package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(FibonacciNumber(8));
    }


    public static int FibonacciNumber(int num) {
        if(num == 0) {
            return 0;
        }

        else if ( num == 1) {
            return 1;
        }
        else {
            return FibonacciNumber(num - 1) + FibonacciNumber(num - 2);
        }

    }
}
