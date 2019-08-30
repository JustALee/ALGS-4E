package chapter1.section2;

import java.util.Arrays;

public class StaticSETofInts {
    private int[] a;

    public StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        System.arraycopy(keys, 0, a, 0, keys.length);
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (key < a[mid]) {
                hi = mid-1;
            } else if (key > a[mid]) {
                lo = mid+1;
            } else return mid;
        }
        return -1;
    }
}
