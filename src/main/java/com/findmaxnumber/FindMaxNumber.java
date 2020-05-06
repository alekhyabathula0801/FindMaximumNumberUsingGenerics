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

    public String findMaximumOfStringType(String a, String b, String c) {
        String maximum = a;
        if(b.compareTo(maximum) > 0)
            maximum = b;
        if(c.compareTo(maximum) > 0)
            maximum = c;
        return maximum;
    }
}
