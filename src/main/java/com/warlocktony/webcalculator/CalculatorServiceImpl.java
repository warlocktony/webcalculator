package com.warlocktony.webcalculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String welcome() {
        return "Welcome to Calculator!";
    }

    public String answerPlus(int num1, int num2) {
        int answer = num1 + num2;
        return num1 + " + " + num2 + " = " + answer;
    }

    public String answerMinus(int num1, int num2) {
        int answer = num1 - num2;
        return num1 + " - " + num2 + " = " + answer;
    }

    public String answerMultiply(int num1, int num2) {
        int answer = num1 * num2;
        return num1 + " * " + num2 + " = " + answer;
    }

    public String answerDivide(int num1, int num2) {
        double answer = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + answer;

    }
}
