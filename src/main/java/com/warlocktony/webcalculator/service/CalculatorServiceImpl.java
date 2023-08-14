package com.warlocktony.webcalculator.service;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String welcome() {
        return "Welcome to Calculator!";
    }

    @Override
    public int answerPlus(int num1, int num2) {

        if ((num1 & num2) <= 1_073_741_821 &
                (num1 & num2) >= -1_073_741_821) {
            return  num1 + num2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int answerMinus(int num1, int num2) {
        if ((num1 & num2) <= 1_073_741_821 &
                (num1 & num2) >= -1_073_741_821) {
            return  num1 - num2;
        } else {
            throw new IllegalArgumentException();
        }
    }


    public int answerMultiply(int num1, int num2) {
        if ((num1 & num2) <= 46_300 &
                (num1 & num2) >= -46_300) {
            return  num1 * num2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double answerDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return (double) num1 / num2;

    }
}
