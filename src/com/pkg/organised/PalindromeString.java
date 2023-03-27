package com.pkg.organised;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        checkPalindrome(str);
    }

    static void checkPalindrome(String str) {
        String actual = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (actual.equals(rev)) System.out.println(actual + " is a Palindrome");
        else System.out.println(actual + " is not a Palindrome");
    }
}
