package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestEqual {
    public static void main(String[] args) {
        int num1 = StdIn.readInt();
        int num2 = StdIn.readInt();
        int num3 = StdIn.readInt();
        if (num1 == num2 && num2 == num3) {
            StdOut.print("equal");
        } else {
            StdOut.print("not equal");
        }
    }
}
