package com.example.caluclatorusingoops;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
    public AdvancedCalculator(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double power() {
        return Math.pow(num1, num2);
    }

    @Override
    public int modulus() {
        if (num2 != 0) {
            return num1 % num2;
        }
        throw new ArithmeticException("Modulus by zero");
    }
}
