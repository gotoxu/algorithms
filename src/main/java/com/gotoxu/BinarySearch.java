package com.gotoxu;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class BinarySearch {
    private static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo == hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid;
            } else if (key > a[mid]) {
                lo = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);

        Stopwatch sw = new Stopwatch();
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
        StdOut.println("BinarySearch: ");
        StdOut.println(sw.elapsedTime());
        StdOut.println();
    }
}
