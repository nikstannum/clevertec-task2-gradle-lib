package ru.clevertec;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private static StringUtils utils;

    @BeforeAll
    static void beforeAll() {
        utils = new StringUtils();
    }

    @Test
    void positiveDoubleTrue() {
        assertTrue(utils.isPositiveNumber("1.023"));
    }

    @Test
    void positiveIntTrue() {
        assertTrue(utils.isPositiveNumber("2"));
    }

    @Test
    void negativeIntFalse() {
        assertFalse(utils.isPositiveNumber("-1"));
    }

    @Test
    void negativeDoubleFalse() {
        assertFalse(utils.isPositiveNumber("-2.02145"));
    }

    @Test
    void zeroNumberFalse() {
        assertFalse(utils.isPositiveNumber("0"));
    }

    @Test
    void invalidInputExc() {
        assertThrows(NumberFormatException.class, () -> utils.isPositiveNumber("kfvmsdkl"));
    }
}
