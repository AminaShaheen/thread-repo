package com.pkg.organised;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("Numbers before swapping " + num1 + " " + num2);
        swap1(num1, num2);
        fun2(num1, num2);
        fun3(num1, num2);
        fun4(num1, num2);
        fun5(num1, num2);
    }

    static void swap1(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Numbers after swapping " + n1 + " " + n2);
    }

    static void fun2(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Numbers after swapping " + n1 + " " + n2);
    }

    static void fun3(int n1, int n2) {

        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;
        System.out.println("Numbers after swapping " + n1 + " " + n2);
    }

    static void fun4(int n1, int n2) {
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("Numbers after swapping " + n1 + " " + n2);

    }

    static void fun5(int n1, int n2) {
        n2 = n1 + n2 - (n1 = n2);
        System.out.println("Numbers after swapping " + n1 + " " + n2);
    }
}
