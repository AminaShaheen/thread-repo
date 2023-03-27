package com.pkg.organised;

public class RevString {
    public static void main(String[] args) {
        String str = "123 123";
        revStr2(str);
    }

    static void revStr1(String str) {
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    static void revStr2(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
