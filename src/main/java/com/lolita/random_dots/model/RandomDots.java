package com.lolita.random_dots.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

public class RandomDots {
    ArrayList<Dot> dots = new ArrayList<>();

    private double randX;
    private double randY;
    private double randZ;

    private String json;

    private ArrayList<Dot> getRandomDots(int length, int width, int height, int dotsQuantity) {
        for (int i = 0; i < dotsQuantity; i++) {
            randX = -length + Math.random() * length;
            randY = -width + Math.random() * width;
            randZ = -height + Math.random() * height;
            Dot dot = new Dot(randX, randY, randZ);
            dots.add(dot);
        }
        return dots;
    }

    public String getRandomDotsJSON(int length, int width, int height, int dotsQuantity) {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        RandomDots randomDots = new RandomDots();
        try {
            json = objectMapper.writeValueAsString(
                    randomDots.getRandomDots(length,width,height, dotsQuantity));
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
