package org.itmo.lab2;

public class Calculator {
    public Boolean isInginMode;
    public Integer roundingMode;
    public Calculator(boolean isInginMode, int roundingMode) {
        this.isInginMode = isInginMode;
        this.roundingMode = roundingMode;
    }
    public Calculator() {
        this.isInginMode = false;
        this.roundingMode = 1;
    }
    public int addition(int a, int b) {
        int c = a+b;
        return c;
    }
    public double addition(double a, double b) {
        double c = a+b;
        return c;
    }
    public long addition(long a, long b) {
        long c = a+b;
        return c;
    }
    public int subtraction(int a, int b) {
        int c = a-b;
        return c;
    }
    public double subtraction(double a, double b) {
        double c = a-b;
        return c;
    }
    public long subtraction(long a, long b) {
        long c = a-b;
        return c;
    }
    public int multiplication(int a, int b) {
        int c = a*b;
        return c;
    }
    public double multiplication(double a, double b) {
        double c = a*b;
        return c;
    }
    public long multiplication(long a, long b) {
        long c = a*b;
        return c;
    }
    public double division(int a, int b) {
        double c = (double)a/b;
        return c;
    }
    public double division(double a, double b) {
        double c = a/b;
        return c;
    }
    public double division(long a, long b) {
        double c = (double)a/b;
        return c;
    }
}