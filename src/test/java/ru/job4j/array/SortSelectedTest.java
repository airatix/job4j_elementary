package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10elements() {
        int[] data = new int[] {25, 16, -5, 10, 0, -50, 77, 0, -1, 100};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-50, -5, -1, 0, 0, 10, 16, 25, 77, 100};
        Assert.assertArrayEquals(expected, result);
    }
}