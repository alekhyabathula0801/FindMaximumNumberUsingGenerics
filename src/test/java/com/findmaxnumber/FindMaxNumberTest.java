package com.findmaxnumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenMaxIntegerAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Integer maxNumber = findMaxNumber.findMax(6,3,1);
        Assert.assertEquals(6,maxNumber.intValue());
    }

    @Test
    public void givenMaxIntegerAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMax(-100,-10,-20);
        Assert.assertEquals(-10,maxNumber);
    }

    @Test
    public void givenMaxIntegerAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMax(1,-5,10);
        Assert.assertEquals(10,maxNumber);
    }

    @Test
    public void givenMaxFloatAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMax(1.3f,1.2f,1.1f);
        Assert.assertEquals(1.3, maxNumber, 0.001);
    }

    @Test
    public void givenMaxFloatAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMax(-1.6f,-1.58f,-1.59f);
        Assert.assertEquals(-1.58, maxNumber, 0.001);
    }
    @Test
    public void givenMaxFloatAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMax(-0.1f,-1.1f,0.0f);
        Assert.assertEquals(0.0, maxNumber, 0.001);
    }

    @Test
    public void givenMaxStringAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMax("banana","Banana","Peach");
        Assert.assertEquals("banana", maximum);
    }

    @Test
    public void givenMaxStringAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMax("Banana","apple","Peach");
        Assert.assertEquals("apple", maximum);
    }

    @Test
    public void givenMaxStringAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMax("Banana","Apple","Peach");
        Assert.assertEquals("Peach", maximum);
    }
}
