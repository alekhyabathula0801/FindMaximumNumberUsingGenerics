package com.findmaxnumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenMaxNumberOfIntegerTypeAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximumOfIntegerType(6,3,4);
        Assert.assertEquals(6,maxNumber);
    }

    @Test
    public void givenMaxNumberOfIntegerTypeAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximumOfIntegerType(-100,-10,-20);
        Assert.assertEquals(-10,maxNumber);
    }

    @Test
    public void givenMaxNumberOfIntegerTypeAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        int maxNumber = findMaxNumber.findMaximumOfIntegerType(1,-5,10);
        Assert.assertEquals(10,maxNumber);
    }

    @Test
    public void givenMaxNumberOfFloatTypeAt1stPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMaximumNumberOfFloatType(1.3f,1.2f,1.1f);
        Assert.assertEquals(1.3, maxNumber, 0.001);
    }

    @Test
    public void givenMaxNumberOfFloatTypeAt2ndPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMaximumNumberOfFloatType(-1.6f,-1.58f,-1.59f);
        Assert.assertEquals(-1.58, maxNumber, 0.001);
    }
    @Test
    public void givenMaxNumberOfFloatTypeAt3rdPosition_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Float maxNumber = findMaxNumber.findMaximumNumberOfFloatType(-0.1f,-1.1f,0.0f);
        Assert.assertEquals(0.0, maxNumber, 0.001);
    }

    @Test
    public void givenMaximumAt1stPositionOfStringType_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMaximumOfStringType("banana","Banana","Peach");
        Assert.assertEquals("banana", maximum);
    }

    @Test
    public void givenMaximumAt2ndPositionOfStringType_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMaximumOfStringType("Banana","apple","Peach");
        Assert.assertEquals("apple", maximum);
    }

    @Test
    public void givenMaximumAt3rdPositionOfStringType_ShouldReturnSameNumber() {
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        String maximum = findMaxNumber.findMaximumOfStringType("Banana","Apple","Peach");
        Assert.assertEquals("Peach", maximum);
    }
}
