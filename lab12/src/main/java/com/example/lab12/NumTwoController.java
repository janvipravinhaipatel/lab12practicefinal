package com.example.lab12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumTwoController {

    @GetMapping("/double")
    public int num(@RequestParam(value = "number", defaultValue = "0") int num){return num*2;};


}


