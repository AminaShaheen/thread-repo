package com.pkg.organised;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int check;
        int evencount = 0, oddcount = 0;


        while (num != 0) {
            check = num % 10;
            if (check % 2 == 0) evencount++;
            else oddcount++;
            num = num / 10;
        }
        System.out.println("Even numbers " + evencount + " Odd numbers " + oddcount);
    }
}
