package com.sample.gouri.recursion;

public class Recursion {
    public int fact(int n)
    {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }
}
