package chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
    public static void main(String[] args) {
        Stack<String> left = new Stack<>();
        boolean isBalance = false;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "[":
                case "(":
                case "{":
                    left.push(s);
                    break;
                case "]":
                    isBalance = left.pop().equals("[");
                    break;
                case ")":
                    isBalance = left.pop().equals("(");
                    break;
                case "}":
                    isBalance = left.pop().equals("{");
                    break;
                default:
                    break;
            }
        }
        if (isBalance) {
            StdOut.println("Input text stream's parentheses are properly balanced.");
        } else {
            StdOut.println("Input text stream's parentheses aren't properly balanced ");
        }
    }
}
