package com.warlocktony.webcalculator.controller;


import com.warlocktony.webcalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService ;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String welcome(){
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String answerPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculatorService.answerPlus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String answerMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.answerMinus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String answerMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.answerMultiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String answerDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.answerDivide(num1,num2);
    }
}
