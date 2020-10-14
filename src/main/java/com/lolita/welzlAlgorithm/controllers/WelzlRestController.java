package com.lolita.welzlAlgorithm.controllers;

import org.springframework.web.bind.annotation.*;

import com.lolita.welzlAlgorithm.model.CalculateResult;


@RestController
public class WelzlRestController {
    @GetMapping("/welzl")
    @ResponseBody
    public String getWelzl(@RequestParam(required = false) Integer length, Integer width, Integer height, Integer dotsQuantity) {
        CalculateResult result = new CalculateResult();

        return result.getResultJSON(length, width, height, dotsQuantity);
    }
}
