package com.Calculator.Calculator;

@org.springframework.stereotype.Service
public class Service {

    public String hello() {
        return "Добро пожаловать в калькулятор!";
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
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        double result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }


}

