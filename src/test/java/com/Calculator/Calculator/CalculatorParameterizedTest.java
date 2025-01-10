package com.Calculator.Calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "Добро пожаловать в калькулятор!",
    })
    public void helloParameterizedTest(String expectedResult) {
        Service service = new Service();
        assertEquals(expectedResult, service.hello());
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 5 + 5 = 10",
    })
    public void sumParameterizedTest(String num1, String num2, String expectedResult) {
        Service service = new Service();
        assertEquals(expectedResult, service.sum(5, 5));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 5 - 5 = 0",
    })
    public void minusParameterizedTest(String num1, String num2, String expectedResult) {
        Service service = new Service();
        assertEquals(expectedResult, service.minus(5, 5));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 5 * 5 = 25",
    })
    public void multyolyParameterizedTest(String num1, String num2, String expectedResult) {
        Service service = new Service();
        assertEquals(expectedResult, service.multyply(5, 5));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 5/5=1.0",
    })
    public void divideParameterizedTest(String num1, String num2, String expectedResult) {
        Service service = new Service();
        assertEquals(expectedResult, service.divide(5, 5));
    }
}



