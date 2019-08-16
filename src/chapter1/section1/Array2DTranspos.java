package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Array2DTranspos {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        transposition(a);
    }

    public static void transposition(int[][] a) {
        // Create a new 2D array, but switch the num of cols and rows.
        int cols = a.length;
        int rows = a[0].length;
        int[][] b = new int[rows][cols];
        // Iterate the rows and cols of a, assign to b.
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                b[j][i] = a[i][j];
        // How to print a nested array.
        // ref: https://stackoverflow.com/a/409795
        StdOut.print(Arrays.deepToString(b));
    }
}
