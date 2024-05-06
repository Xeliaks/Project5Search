package com.example.project5search;

public class Part1 {
    public int sum1toN(int n) { // You may assume n ≥ 1
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    public int sum1toNRec(int n) {

        if (n == 1) {
            return 1;
        }
        return n + sum1toN(n - 1);
    }

    public double power(double x, int n) {

        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        Part1 p1 = new Part1();
        System.out.println(p1.sum1toN(10));
        System.out.println(p1.sum1toNRec(10));
    }
}
