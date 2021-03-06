package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To5Then5() {
        int a = 3;
        int b = 2;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To5To9Then9() {
        int a = 3;
        int b = 2;
        int c = 5;
        int d = 9;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}