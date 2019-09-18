package chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static void main(String[] args) {
        /*
        As you know, an expression is made of one operator and two operands,
        what we need to do is split the whole input as multi subexpressions,
        every time we meet a ), we pop 1 operator and 2 operands,
        insert the missing ( on the left, to build a new string and see it as a operand.
        repeat until you've parsed all the inputs.
         */
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
