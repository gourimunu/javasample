package com.sample.gouri.UseStatic;

public class usestatic {

    static int a = 3;
    static int b;

    public static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}
