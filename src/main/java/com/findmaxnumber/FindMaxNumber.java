package com.findmaxnumber;

public class FindMaxNumber {

    public Integer findMaximum(Integer a, Integer b, Integer c) {
        Integer maximum = a;
        if(maximum < b)
            maximum = b;
        if(maximum < c)
            maximum = c;
        return maximum;
    }

}
