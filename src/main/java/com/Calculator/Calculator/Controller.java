package com.Calculator.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Service service = new Service();

    @GetMapping("/calculator")
    public String hello() {
        return service.hello();
    }

    @GetMapping("/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return service.sum(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 - num2;
        return service.minus(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 * num2;
        return service.multyply(num1, num2);
    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 / num2;
        return service.divide(num1, num2);
    }
}
