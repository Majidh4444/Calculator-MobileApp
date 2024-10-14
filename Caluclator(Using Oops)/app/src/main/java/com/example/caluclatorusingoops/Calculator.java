// Calculator.java
package com.example.caluclatorusingoops;

public abstract class Calculator {
    protected int num1;
    protected int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract int add();
    public abstract int subtract();
    public abstract int multiply();
    public abstract double divide();
}


