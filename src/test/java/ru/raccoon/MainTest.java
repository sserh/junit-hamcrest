package ru.raccoon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 100, 30})
    public void isPositiveAndEven(int value) {
        assertTrue(Main.isNeededNumber(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 7, 201})
    public void isNotPositiveAndEven(int value) {
        assertFalse(Main.isNeededNumber(value));
    }

    @Test
    void testIsNeededNumber() {
        final int value_1 = 2; //true, положительное чётное
        final int value_2 = 0; //false, неположительное
        final int value_3 = -1; //false, неположительное, нечётное
        final int value_4 = 5; //false, нечётное

        assertTrue(Main.isNeededNumber(value_1));
        assertFalse(Main.isNeededNumber(value_2));
        assertFalse(Main.isNeededNumber(value_3));
        assertFalse(Main.isNeededNumber(value_4));
    }

    @Test
    public void testWordsCount_Single() {
        int value = 2;
        assertThat(value, equalTo(Main.wordsCount(" Рабиндранат Тагор")));
    }

    @Test
    public void testWordsCount_Array() {
        Integer[] array = new Integer[]{Main.wordsCount("Ехали медведи на велосипеде")
                , Main.wordsCount(" Волки от испуга скушали друг друга ")};
        assertThat(array, arrayContaining(4, 6));
    }
}