package chapter1.section2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class VisualCounter {
    private final int max_op;
    private final int max_count;
    private int count_op;
    private int count;

    public VisualCounter(int N, int max) {
        max_op = N;
        max_count = max;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(.01);
        StdDraw.point(0,0);
    }

    public void increment() {
        count++;
        op();
    }

    public void decrement() {
        count--;
        op();
    }

    private void op() {
        count_op++;
        if (Math.abs(count) > max_count) {
            throw new RuntimeException("Exceeding the maximum number of count.");
        } else if (count_op > max_op) {
            throw new RuntimeException("Exceeding the maximum number of operations.");
        }
        StdDraw.point(count_op, count);
    }

    public int tally() {
        return count;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        int max = StdIn.readInt();
        VisualCounter counter = new VisualCounter(N, max);
        for (int i = 0; i < N; i++) {
            if (StdRandom.bernoulli()) {
                counter.increment();
            } else {
                counter.decrement();
            }
            StdOut.printf("Current count: %d\n", counter.tally());
        }
    }
}
