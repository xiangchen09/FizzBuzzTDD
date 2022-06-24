package com.luv2code.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTestFromScratch {

    //if number is divisible by 3, return "Fizz"
    @Test
    public void testForDividedByThree() {

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz2.compute(3));
    }

    //if number is divisible by 5, return "Buzz"
    @Test
    public void testForDividedByFive() {

        String expected = "Buzz";

        assertEquals(expected, FizzBuzz2.compute(5));
    }

    //if number is divisible by 5 and 3, return "FizzBuzz"
    @Test
    public void testForDividedByThreeAndFive() {

        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz2.compute(15));
    }

    //if number is not divisible by 5 or 3, return "number"
    @Test
    public void testForNotDivisibleByThreeAndFive() {

        String expected = "1";

        assertEquals(expected, FizzBuzz2.compute(1));
    }

    @ParameterizedTest(name = "value = {0} expected = {1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    public void testForSmallTestData(int value, String expected) {

        assertEquals(expected, FizzBuzz2.compute(value));
    }

    @ParameterizedTest(name = "value = {0} expected = {1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    public void testForMediumTestData(int value, String expected) {

        assertEquals(expected, FizzBuzz2.compute(value));
    }

    @ParameterizedTest(name = "value = {0} expected = {1}")
    @CsvFileSource(resources = "/custom-test-data.csv")
    public void testForCustomTestData(int value, String expected) {

        assertEquals(expected, FizzBuzz2.compute(value));
    }
}
