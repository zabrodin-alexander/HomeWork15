package com.Calculator.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void helloTest() { //Сооздаем проверочный метод hello
        Service service = new Service(); //Создаем объект service класса Service
        assertEquals("Добро пожаловать в калькулятор!", service.hello());
    }

    @Test
    public void sumTest() {
        Service service = new Service();
        assertEquals("5 + 5 = 10", service.sum(5, 5));
    }

    @Test
    public void minusTest() {
        Service service = new Service();
        assertEquals("5 - 5 = 0", service.minus(5, 5));
    }

    @Test
    public void multyplyTest() {
        Service service = new Service();
        assertEquals("5 * 5 = 25", service.multyply(5, 5));
    }

    @Test
    public void divideTest() {
        Service service = new Service();
        assertEquals("5/5=1.0", service.divide(5, 5));
    }

}
