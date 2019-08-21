package chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearchV2 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.printf("+ %s\n", key);
            }
            else {
                StdOut.printf("- %s\n", key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        return rank(key, a , 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo+(hi-lo)/2;
        if (a[mid] > key) return rank(key, a, lo, mid-1);
        else if (a[mid] < key) return rank(key, a, mid+1, hi);
        else return mid;
    }
}
