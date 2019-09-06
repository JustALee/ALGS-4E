package chapter1.section2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Calendar;

public class SmartDate {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m, int d, int y) {
        /* Validate if the given days is legal,
        in the meanwhile, it could validate the given month, too  */
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d >= 1 && d <= 31) {
                    day = d;
                } else {
                    throw new IllegalArgumentException("Days of given month should be between 1 and 31");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d >= 1 && d <= 30) {
                    day = d;
                } else {
                    throw new IllegalArgumentException("Days of given month should be between 1 and 30");
                }
                break;
            case 2:
                if (y%4 != 0) {
                    if (d >= 1 && d <= 28) {
                        day = d;
                    } else {
                        throw new IllegalArgumentException("Days in Feb of common year should be between 1 and 28");
                    }
                } else {
                    if (d >= 1 && d <= 29) {
                        day = d;
                    } else {
                        throw new IllegalArgumentException("Days in Feb of leap year should be between 1 and 29");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Month value should be between 1 and 12");
        }
        month = m;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String dayOfTheWeek() {
        Calendar c = Calendar.getInstance();
        // Month value is 0-based, so it has to -1 to set date correctly
        c.set(year, month - 1, day);
        int dow = c.get(Calendar.DAY_OF_WEEK);
        switch (dow) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return null;
        }
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        SmartDate that = (SmartDate) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    public static void main(String[] args) {
        int m = StdIn.readInt();
        int d = StdIn.readInt();
        int y = StdIn.readInt();
        SmartDate date = new SmartDate(m, d, y);
        StdOut.printf("%s is %s\n", date, date.dayOfTheWeek());
    }
}
