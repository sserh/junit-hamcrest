package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.raccoon.Main;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 100, 30})
    public void testTrue(int value) {
        assertTrue(Main.isNeededNumber(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 7, 201})
    public void testFalse(int value) {
        assertFalse(Main.isNeededNumber(value));
    }
    @Test
    void isNeededNumber() {
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
    void wordsCount() {
        int value = 2;
        assertThat(value, equalTo(Main.wordsCount(" Рабиндранат Тагор")));
    }

    @Test
    public void givenArray_whenCheck_thenContainsElements() {
        Integer[] array = new Integer[]{Main.wordsCount("Ехали медведи на велосипеде")
                , Main.wordsCount(" Волки от испуга скушали друг друга ")};
        assertThat(array, arrayContaining(4, 6));
    }
}