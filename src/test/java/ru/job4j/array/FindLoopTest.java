package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void successfulElementSearch() {
        int[] data = {25, 10, 100, 50, 5, 2};
        int element = 5;
        int actual = FindLoop.indexOf(data, element);
        int expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void unsuccessfulElementSearch() {
        int[] data = {25, 10, 100, 50, 5, 2};
        int element = 500;
        int actual = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);
    }
}