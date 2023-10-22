package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class ConverterTest {

    @Test
    void transfer350RublesTo5Euro() {
        float inRuble = 350;
        float expected = 5;
        float outEuro = Converter.rubleToEuro(inRuble);
        float eps = 0.0001f;
        assertThat(outEuro).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void transfer300RublesTo5Dollars() {
        float inRuble = 300;
        float expected = 5;
        float outDollar = Converter.rubleToDollar(inRuble);
        float eps = 0.0001f;
        assertThat(outDollar).isEqualTo(expected, withPrecision(eps));
    }
}