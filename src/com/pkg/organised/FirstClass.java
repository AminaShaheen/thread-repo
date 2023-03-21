package com.pkg.organised;

public class FirstClass {
    public static void main(String[] args) {
        Swap s=new Swap();
        int num1=5, num2=3;
        System.out.println("num1="+num1+" num2="+num2);
        s.swapNum(num1,num2);
    }
}

class Swap{

    void swapNum(int n, int m){
        int temp;
        temp=n;
        n=m;
        m=temp;
        System.out.println("num1="+n+" num2="+m);
}
}