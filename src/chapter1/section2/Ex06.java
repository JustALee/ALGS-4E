package chapter1.section2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex06 {
    public static void main(String[] args) {
        String s = StdIn.readString();
        String t = StdIn.readString();
        if (s.length() == t.length() && (s.concat(s).contains(t))) {
            StdOut.printf("String %s is the circular rotation of String %s.\n", s, t);
        } else {
            StdOut.printf("String %s isn't the circular rotation of String %s.\n", s, t);
        }
    }
}
