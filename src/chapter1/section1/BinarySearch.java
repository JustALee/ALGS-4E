package chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length-1;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if (a[mid] > key) hi = mid-1;
            else if (a[mid] < key) lo = mid+1;
            else return mid;
        }
        return -1;
    }
}
