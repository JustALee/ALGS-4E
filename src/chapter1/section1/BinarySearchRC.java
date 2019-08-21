package chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearchRC {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.printf("Hit: %s.\n\n", key);
            }
            else {
                StdOut.print("No hit.\n\n");
            }
        }
    }

    public static int rank(int key, int[] a) {
        int indent = 0;
        return rank(key, a , 0, a.length - 1, indent);
    }

    public static int rank(int key, int[] a, int lo, int hi, int indent) {
        StdOut.printf("%slo=%d hi=%d\n", "\t".repeat(indent), lo, hi);
        indent++;
        if (lo > hi) return -1;
        int mid = lo+(hi-lo)/2;
        if (a[mid] > key) return rank(key, a, lo, mid-1, indent);
        else if (a[mid] < key) return rank(key, a, mid+1, hi, indent);
        else return mid;
    }
}
