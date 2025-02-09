package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")
public class SumCalcController {

    @GetMapping
    public String sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return "Сумма чисел " + a + " и " + b + " равна " + (a + b);
    }
}
