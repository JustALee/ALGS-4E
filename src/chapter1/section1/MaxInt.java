package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MaxInt {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        StdOut.print(lg(n));
    }

    public static int lg(int n) {
        if (n != 0) {
            int res = 1;
            int log = -1;
            while (res < n) {
                res *= 2;
                log++;
            }
            return log;
        } else return 0;
    }
}
