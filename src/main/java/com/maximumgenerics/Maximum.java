package com.maximumgenerics;

public class Maximum<E extends Comparable> {

    E[] values;

    public Maximum(E ...values) {
        this.values = values;
    }

    public E findMax() {
        return findMax(values);
    }

    public static <E extends Comparable> E findMax(E[] values) {
        E maximum = values[0];
        for ( int i=1; i < values.length; i++) {
            if (values[i].compareTo(maximum) > 0)
                maximum = values[i];
        }
        return maximum;
    }
}
