package com.warlocktony.webcalculator;

public interface CalculatorService {
    String welcome();

    String answerPlus(int num1, int num2);

    String answerMinus(int num1, int num2);

    String answerMultiply(int num1, int num2);

    String answerDivide(int num1, int num2);
}
