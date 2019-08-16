package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestZeroToOne {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (compare(x) && compare(y)) {
            StdOut.print("true");
        } else {
            StdOut.print("false");
        }
    }

    public static boolean compare(double num) {
        return num > 0 && num < 1;
    }
}