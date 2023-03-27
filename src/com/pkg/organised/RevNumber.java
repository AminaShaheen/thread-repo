package com.pkg.organised;

public class RevNumber {

    public static void main(String[] args) {
        int num = 1234;
        revNum2(num);
    }

    static void revNum1(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
    }

    static void revNum2(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        String rev = sb.reverse().toString();
        Integer.parseInt(rev);
        System.out.println(rev);
    }
}

