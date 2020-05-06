package com.findmaxnumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenMaxNumberAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximum(6,3,4);
        Assert.assertEquals(6,maxNumber);
    }

    @Test
    public void givenMaxNumberAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximum(-100,-10,-20);
        Assert.assertEquals(-10,maxNumber);
    }

    @Test
    public void givenMaxNumberAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximum(1,-5,10);
        Assert.assertEquals(10,maxNumber);
    }
}
