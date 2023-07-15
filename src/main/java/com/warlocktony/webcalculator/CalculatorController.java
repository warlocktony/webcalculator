package com.warlocktony.webcalculator;


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
        return calculatorService.answerPlus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String answerMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerMinus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String answerMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.answerMultiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String answerDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0){
            return "DIVIDE ON 0 FORBIDDEN!!!";
        }
        return calculatorService.answerDivide(num1,num2);
    }
}
