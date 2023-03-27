package com.pkg.organised;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count > 0)
                System.out.println("Not Prime");
            else
                System.out.println("Prime");
        }
    }
}
