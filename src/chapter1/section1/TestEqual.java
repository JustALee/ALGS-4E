package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class TestEqual {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        if (num1 == num2 && num2 == num3) {
            StdOut.print("equal");
        }
        else StdOut.print("not equal");
    }
}
