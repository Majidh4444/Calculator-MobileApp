package com.example.caluclatorusingoops;
public class BasicCalculator extends Calculator {
    public BasicCalculator(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int add() {
        return num1 + num2;
    }

    @Override
    public int subtract() {
        return num1 - num2;
    }

    @Override
    public int multiply() {
        return num1 * num2;
    }

    @Override
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        }
        throw new ArithmeticException("Division by zero");
    }
}
