package com.findmaxnumber;

public class FindMaxNumber {

    public Integer findMaximumOfIntegerType(Integer a, Integer b, Integer c) {
        Integer maximum = a;
        if(maximum < b)
            maximum = b;
        if(maximum < c)
            maximum = c;
        return maximum;
    }

    public Float findMaximumNumberOfFloatType(float a, float b, float c) {
        Float maximum = a;
        if(maximum < b)
            maximum = b;
        if(maximum < c)
            maximum = c;
        return maximum;
    }

}
