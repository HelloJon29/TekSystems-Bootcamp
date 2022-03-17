package com.example.junitexercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest1 {

    @Test
    void add_should_return_valid_added_value_give_two_numbers() {
        Calculator1 testCalc = new Calculator1();
        int actualResult = testCalc.add(4,5);

        Assertions.assertEquals(9,actualResult);
    }
}
