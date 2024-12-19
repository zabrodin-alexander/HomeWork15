package com.Calculator.Calculator;

@org.springframework.stereotype.Service
public class Service {

    public String hello() {
        return "<b> Добро пожаловать в калькулятор!</b>";
    }

    public String sum(int num1, int num2) {
        int result = num1 + num2;
        return String.format("%d + %d = %d", num1, num2, result);
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return String.format("%d - %d = %d", num1, num2, result);
    }

    public String multyply(int num1, int num2) {
        int result = num1 * num2;
        return String.format("%d * %d = %d", num1, num2, result);
    }
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return String.format("%d / %d = %d", num1, num2, result);
    }
}

