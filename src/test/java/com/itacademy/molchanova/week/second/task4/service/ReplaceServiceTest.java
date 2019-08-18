package com.itacademy.molchanova.week.second.task4.service;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceServiceTest {

    private ReplaceService replaceService = new ReplaceService();

    @Test
    public void checkReplaceArray() {
        Integer[] array = {5, 3, 2, 8, 7, 4, 1, 2};
        Integer[] arrayTest = {1, 3, 2, 8, 5, 4, 7, 2};
        assertArrayEquals(arrayTest, replaceService.sortArray(array));

    }
}
