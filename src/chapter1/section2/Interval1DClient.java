package chapter1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Interval1DClient {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            Interval1D interval = new Interval1D(lo, hi);
            intervals[i] = interval;
        }
        if (N > 1) {
            for (int i = 0; i < N-1; i++) {
                for (int j = i+1; j < N; j++) {
                    if (intervals[i].intersects(intervals[j])) {
                        StdOut.printf("%s intersects %s\n", intervals[i], intervals[j]);
                    }
                }
            }
        } else {
            StdOut.println("There won't be enough intervals to intersects.");
        }
    }
}
