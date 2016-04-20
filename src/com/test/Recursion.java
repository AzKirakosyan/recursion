package com.test;


public class Recursion {


    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static int pow(int a, int b) {
        if (a == 0) {
            return 0;
        }

        if (a == 1 || b == 0) {
            return 1;
        }

        if (b == 1) {
            return a;
        }

        return a * pow(a, b - 1);

    }

    public static int fakt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fakt(n - 1);
    }

    public static int f(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        return f(a - 1, b + 1);

    }
}
