package chapter1.section2;

import edu.princeton.cs.algs4.*;

/**
 * Not really sure what this exercise means. :(
 */

public class Interval2DClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
        Interval2D[] intervals = new Interval2D[N];
        Point2D[] leftTop = new Point2D[N];
        Point2D[] rightBottom = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double xlo = StdRandom.uniform(min, max);
            double xhi = StdRandom.uniform(min, max);
            double ylo = StdRandom.uniform(min, max);
            double yhi = StdRandom.uniform(min, max);
            Interval2D interval = new Interval2D(
                    genInterval1D(xlo, xhi),
                    genInterval1D(ylo, yhi)
            );
            intervals[i] = interval;
            leftTop[i] = new Point2D(xlo, yhi);
            rightBottom[i] = new Point2D(xhi, ylo);
            interval.draw();
        }
        if (N > 1) {
            int contains = 0;
            int intersect = 0;
            for (int i = 0; i < N-1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (intervals[i].contains(leftTop[i]) && intervals[i].contains(rightBottom[i])) {
                        contains++;
                    }
                    if (intervals[i].intersects(intervals[j])) {
                        intersect++;
                    }
                }
            }
            StdOut.println("Contains count: " + contains);
            StdOut.println("Intersects count: " + intersect);
        }
    }

    private static Interval1D genInterval1D(double lo, double hi) {
        if (lo > hi) {
            double tmp = lo;
            lo = hi;
            hi = tmp;
        }
        return new Interval1D(lo, hi);
    }
}
