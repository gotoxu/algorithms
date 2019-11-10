package com.gotoxu;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        int[] ans = new int[n];
        ans[0] = 0;
        ans[1] = 1;

        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }

        return ans[n - 1];
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        int ans = fibonacci(n);
        StdOut.println(ans);
    }
}
