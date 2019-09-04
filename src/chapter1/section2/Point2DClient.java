package chapter1.section2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Point2DClient {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();
            Point2D p = new Point2D(x, y);
            points[i] = p;
            p.draw();
        }
        if (N > 1) {
            double closest_d = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    double d = points[i].distanceTo(points[j]);
                    if (d < closest_d) {
                        closest_d = d;
                    }
                }
            }
            StdOut.printf("The closest distance is %f\n", closest_d);
        } else {
            StdOut.println("There aren't enough objects to compare in this case.");
        }
    }
}
