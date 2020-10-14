package com.lolita.randomDots.сontrollers;

import org.springframework.web.bind.annotation.*;

import com.lolita.randomDots.model.RandomDots;
import com.lolita.randomDots.parameters.RandomParameters;


@RestController
public class RandRestController {
    @GetMapping("/random-dots")
    @ResponseBody
    public String getDots(@RequestParam(required = false) Integer length, Integer width, Integer height, Integer dotsQuantity) {
        RandomParameters params = new RandomParameters();
        params.setParameters(length, width, height, dotsQuantity);

        RandomDots randomDots = new RandomDots();

        return randomDots.getRandomDotsJSON(params.getLength(), params.getWidth(), params.getHeight(),
                params.getDotsQuantity());
    }
}
