package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfThreeNumbers() {
        int first = 10;
        int second = 100;
        int third = 1000;
        int result = Max.max(first, second, third);
        int expected = 1000;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfFourthNumbers() {
        int first = 11;
        int second = 22;
        int third = 33;
        int fourth = 44;
        int result = Max.max(first, second, third, fourth);
        int expected = 44;
        Assert.assertEquals(result, expected);
    }
}