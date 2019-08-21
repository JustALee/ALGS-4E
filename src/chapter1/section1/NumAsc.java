package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class NumAsc {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        printabc("Input", a, b, c);
        int[] res = sort(a, b, c);
        a = res[0];
        b = res[1];
        c = res[2];
        printabc("Output", a, b, c);
        if (a < b && b < c) {
            StdOut.print("This algorithm works.");
        }
        else {
            StdOut.print("This algorithm isn't working.");
        }
    }

    public static int[] sort(int a, int b, int c) {
        int t;
        if (a > b) {
            t = a; a = b; b = t;
        }
        if (a > c) {
            t = a; a = c; c = t;
        }
        if (b > c) {
            t = b; b = c; c = t;
        }
        return new int[]{a, b, c};
    }

    public static void printabc(String type, int a, int b, int c) {
        StdOut.printf("%s: a = %d\tb = %d\tc = %d\n", type, a, b, c);
    }
}
