package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2thenSquare2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7dot3K2dot5thenSquare2dot72() {
        double expected = 2.72;
        double p = 7.3;
        double k = 2.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K8thenSquare1dot58() {
        double expected = 1.58;
        double p = 8;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}