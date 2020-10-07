package com.lolita.random_dots.сontrollers;

import com.lolita.random_dots.model.RandomDots;
import com.lolita.random_dots.parameters.RandomParameters;
import org.springframework.web.bind.annotation.*;


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
