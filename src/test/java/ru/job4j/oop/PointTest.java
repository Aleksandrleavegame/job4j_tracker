package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to02then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1122to3344then31dot11() {
        double expected = 31.11;
        Point a = new Point(11, 22);
        Point b = new Point(33, 44);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to34then2dot83() {
        double expected = 2.83;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}