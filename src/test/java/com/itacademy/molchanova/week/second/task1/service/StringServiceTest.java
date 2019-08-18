package com.itacademy.molchanova.week.second.task1.service;

import com.itacademy.molchanova.week.second.task1.StringService;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringServiceTest {

    private StringService stringService = new StringService();

    @Test
    public void checkCorrectString1() {
        String str = "[]{}()";
        boolean result = stringService.checkString(str);
        assertTrue(result);
    }

    @Test
    public void checkCorrectString2() {
        String str = "]{}";
        boolean result = stringService.checkString(str);
        assertFalse(result);
    }

    @Test
    public void checkCorrectString3() {
        String str = "{}]";
        boolean result = stringService.checkString(str);
        assertFalse(result);
    }

    @Test
    public void checkCorrectString4() {
        String str = "";
        boolean result = stringService.checkString(str);
        assertTrue(result);
    }

    @Test
    public void checkCorrectString5() {
        String str = "{()}";
        boolean result = stringService.checkString(str);
        assertTrue(result);
    }
}
