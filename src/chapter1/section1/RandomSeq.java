package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class RandomSeq {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double lo = StdIn.readDouble();
        double hi = StdIn.readDouble();
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
