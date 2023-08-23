package org.homwork3;

public class Counter {
    static int count;

    static {
        count = 0;
    }

    public void increaseCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}