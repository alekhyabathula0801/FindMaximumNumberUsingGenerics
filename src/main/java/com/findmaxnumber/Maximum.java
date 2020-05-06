package com.findmaxnumber;

public class Maximum<E extends Comparable> {

    E a;
    E b;
    E c;

    public Maximum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E findMax() {
        return findMax(a,b,c);
    }

    public static <E extends Comparable> E findMax(E a, E b, E c) {
        E maximum = a;
        if(b.compareTo(maximum) > 0)
            maximum = b;
        if(c.compareTo(maximum) > 0)
            maximum = c;
        return maximum;
    }
}
