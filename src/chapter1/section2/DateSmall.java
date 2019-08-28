package chapter1.section2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DateSmall {
    private final int value;

    public DateSmall(int m, int d, int y) {
        value = 512*y + 32*m + d;
    }

    public int month() {
        return (value/32) % 16;
    }

    public int day() {
        return value % 32;
    }

    public int year() {
        return value / 512;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = StdIn.readInt();
        int d = StdIn.readInt();
        int y = StdIn.readInt();
        Date date = new Date(m, d, y);
        StdOut.println(date);
    }
}
