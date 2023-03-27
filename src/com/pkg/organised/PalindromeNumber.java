package com.pkg.organised;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        checkPalindrome(num);
    }

    static void checkPalindrome(int num) {
        int actual = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (actual == rev) System.out.println(actual + " is a Palindrome");
        else System.out.println(actual + " is not a Palindrome");
    }
}
