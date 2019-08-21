package chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class PrintTable {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            prtLine();
        }
    }

    public static void prtLine() {
        String name = StdIn.readString();
        int num1 = StdIn.readInt();
        int num2 = StdIn.readInt();
        double res = (double)num1 / (double)num2;
        StdOut.printf("%10s%5d%5d%10.3f\n", name, num1, num2, res);
    }
}
