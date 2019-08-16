package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Array2D {
    public static void main(String[] args) {
        boolean[][] a = {
                {true, true},
                {true, false},
                {false, true}
        };
        printBooleanArrays(a);
    }

    public static void printBooleanArrays(boolean[][] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                StdOut.printf("row: %d col: %d val: %s\n", i+1, j+1, a[i][j]?"*":" ");
    }
}
