package com.warlocktony.webcalculator.service;

public interface CalculatorService {

    String welcome();

    int answerPlus(int num1, int num2);

    int answerMinus(int num1, int num2);

    int answerMultiply(int num1, int num2);

    double answerDivide(int num1, int num2);
}
