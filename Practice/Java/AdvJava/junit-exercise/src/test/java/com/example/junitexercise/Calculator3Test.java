package com.example.junitexercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator3Test {
    private Calculator1 calculator1;

    @BeforeEach
    void setUp() {
        calculator1 = new Calculator1();
    }

    @Test
    void should_return_multiplied_value_when_two_numbers_are_given() {
        assertEquals(8, calculator1.multiply(2,4));
        Assertions.assertThat(calculator1.multiply(2,4)).isEqualTo(8);
    }

    @Test
    void should_return_divided_value_when_two_numbers_are_given() {
        assertEquals(2,calculator1.divide(8,4));
        Assertions.assertThat(calculator1.divide(8,4)).isEqualTo(2);
    }

    @Test
    void should_return_ArithmeticException_value_when_0_is_divided() {
        assertThrows(ArithmeticException.class, () -> calculator1.divide(8,0));
        Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> calculator1.divide(8,0));
    }
}
