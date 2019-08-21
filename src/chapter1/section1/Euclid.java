package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Euclid {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int res = gcd(a, b);
        StdOut.printf("The gcd of %d and %d is %d.", a, b, res);
    }

    public static int gcd(int a, int b) {
        StdOut.printf("Dividend: %d\tDivisor: %d\n", a, b);
        int res = a % b;
        if (res != 0) {
            return gcd(b, res);
        }
        else return b;
    }
}
