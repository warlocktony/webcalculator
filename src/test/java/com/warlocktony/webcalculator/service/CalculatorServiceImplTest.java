package com.warlocktony.webcalculator.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {

    private CalculatorService underTest = new CalculatorServiceImpl();

    @Test
    void welcome__returnWelcomeString() {
        String result = underTest.welcome();
        assertEquals("Welcome to Calculator!", result);
    }

    @Test
    void plus_num1AndNum2Positive_resultPositive() {
        var result = underTest.answerPlus(4, 8);
        assertEquals(12, result);
    }

    @Test
    void plus_num1AndNum2Negative_resultNegative() {
        var result = underTest.answerPlus(-8, 4);
        assertEquals(-4, result);
    }

    @Test
    void plus_num1AndNum2AreIntegerMaxValue_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.answerPlus(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void plus_num1AndNum2AreIntegerMinValue_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.answerPlus(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus__resultInt(int num1, int num2, int expectedResult) {
        var result = underTest.answerPlus(num1, num2);
        assertEquals(expectedResult, result);

    }

    private static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of(6, 3, 9),
                Arguments.of(-10, 2, -8)
        );
    }

    @Test
    void minus_ifNum1IsBigNum2_resultPositive() {
        var result = underTest.answerMinus(8, 4);
        assertEquals(4, result);
    }

    @Test
    void minus_ifNum2IsBigNum1_resultNegative() {
        var result = underTest.answerMinus(4, 8);
        assertEquals(-4, result);
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus__resultInt(int num1, int num2, int expectedResult) {
        var result = underTest.answerMinus(num1, num2);
        assertEquals(expectedResult, result);

    }

    private static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of(6, 3, 3),
                Arguments.of(-10, 2, -12)
        );
    }

    @Test
    void multiply_num1AndNum2Positive_resultPositive() {
        var result = underTest.answerMultiply(2, 2);
        assertEquals(4, result);
    }

    @Test
    void multiply_num1AndNum2Negative_resultNegative() {
        var result = underTest.answerMultiply(-2, 2);
        assertEquals(-4, result);
    }

    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply__resultInt(int num1, int num2, int expectedResult) {
        var result = underTest.answerMultiply(num1, num2);
        assertEquals(expectedResult, result);

    }

    private static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of(3, 3, 9),
                Arguments.of(-10, 2, -20)
        );
    }

    @Test
    void multiply_num1AndNum2AreIntegerMaxValue_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.answerMultiply(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void multiply_num1AndNum2AreIntegerMinValue_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.answerMultiply(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }


    @Test
    void divide_num1DivideNum2WithoutFractionResult() {
        var result = underTest.answerDivide(6, 3);
        assertEquals(2, result);

    }

    @Test
    void divide_num1DivideNum2WithFractionResult() {
        var result = underTest.answerDivide(7, 2);
        assertEquals(3.5, result);
    }

    @Test
    void divide_ifNum2IsZero_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> underTest.answerDivide(2, 0));

    }

    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide__resultDouble(int num1, int num2, double expectedResult) {
        var result = underTest.answerDivide(num1, num2);
        assertEquals(expectedResult, result);

    }

    private static Stream<Arguments> dataForDivide() {
        return Stream.of(
                Arguments.of(6, 3, 2),
                Arguments.of(7, 2, 3.5)
        );
    }

}
