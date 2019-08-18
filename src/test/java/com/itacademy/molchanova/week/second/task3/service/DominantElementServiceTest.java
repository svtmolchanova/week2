package com.itacademy.molchanova.week.second.task3.service;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DominantElementServiceTest {

    private DominantElementService dominantElementService = new DominantElementService();
    private static final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,3,5,5,5,5,5,5,1));
    private static final Integer dominantElement = 5;

    @Test
    public void checkDominantElement() {
        Integer max = dominantElementService.getDominantElement(list);
        assertEquals(dominantElement, max);

    }

    @Test
    public void checkDominantElementON() {
        Integer max = dominantElementService.getDominantElementON(list);
        assertEquals(dominantElement, max);
    }
}
