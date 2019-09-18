package chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+":
                case "-":
                case "*":
                case "/":
                    ops.push(s);
                    break;
                case ")":
                    String b = vals.pop();
                    String a = vals.pop();
                    vals.push("(" + a + ops.pop() + b + ")");
                    break;
                default:
                    vals.push(s);
                    break;
            }
        }
        StdOut.println(vals.pop());
    }
}
