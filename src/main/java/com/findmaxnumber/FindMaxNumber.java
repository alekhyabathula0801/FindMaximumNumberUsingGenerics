package com.findmaxnumber;

public class FindMaxNumber {

    public static <E extends Comparable> E findMax(E a, E b, E c) {
        E maximum = a;
        if(b.compareTo(maximum) > 0)
            maximum = b;
        if(c.compareTo(maximum) > 0)
            maximum = c;
        return maximum;
    }
}
