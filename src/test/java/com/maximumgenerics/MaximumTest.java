package com.maximumgenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxIntegerAt1stPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(6,1,2,3,2);
        int max = maximum.findMax();
        Assert.assertEquals(6,max);
    }

    @Test
    public void givenMaxIntegerAt2ndPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(-100,-10,-20,-70);
        int max = maximum.findMax();
        Assert.assertEquals(-10,max);
    }

    @Test
    public void givenMaxIntegerAt3rdPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(1,-5,10);
        int max = maximum.findMax();
        Assert.assertEquals(10,max);
    }

    @Test
    public void givenMaxFloatAt1stPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(1.3f,1.2f);
        Float max = maximum.findMax();
        Assert.assertEquals(1.3, max, 0.001);
    }

    @Test
    public void givenMaxFloatAt2ndPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximumNumber = new Maximum<>(-1.6f,-1.58f,-1.59f);
        Float max = maximumNumber.findMax();
        Assert.assertEquals(-1.58, max, 0.001);
    }
    @Test
    public void givenMaxFloatAt4thPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(-0.1f,-1.1f,-0.9f,0.0f);
        Float max = maximum.findMax();
        Assert.assertEquals(0.0, max, 0.001);
    }

    @Test
    public void givenMaxStringAt1stPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("banana","Banana","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("banana", max);
    }

    @Test
    public void givenMaxStringAt2ndPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("Banana","apple","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("apple", max);
    }

    @Test
    public void givenMaxStringAtlastPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("Banana","Apple","Fruit","Cherry","HAPPY","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("Peach", max);
    }
}
