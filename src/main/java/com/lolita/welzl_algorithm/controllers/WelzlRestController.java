package com.lolita.welzl_algorithm.controllers;

import com.lolita.welzl_algorithm.model.CalculateResult;
import org.springframework.web.bind.annotation.*;


@RestController
public class WelzlRestController {
    @GetMapping("/welzl")
    @ResponseBody
    public String getWelzl(@RequestParam(required = false) Integer length, Integer width, Integer height, Integer dotsQuantity) {
        CalculateResult result = new CalculateResult();

        return result.getResultJSON(length, width, height, dotsQuantity);
    }
}
