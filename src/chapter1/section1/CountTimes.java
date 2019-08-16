package chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class CountTimes {
    public static void main(String[] args) {
        int[] a = {5, 7, 8, 1, 9, 4, 5, 5, 3, 7, 3, 6, 5, 6, 3};
        int m = 10;
        StdOut.print(Arrays.toString(histogram(a, m)));
    }
    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int num: a) {
            if (0 <= num && num < M)
                b[num]++;
        }
        return b;
    }
}
