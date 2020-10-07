package com.lolita.random_dots.parameters;

import static java.util.Objects.nonNull;

public class RandomParameters {
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer dotsQuantity;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDotsQuantity() {
        return dotsQuantity;
    }

    public void setDotsQuantity(Integer dotsQuantity) {
        this.dotsQuantity = dotsQuantity;
    }

    public void setParameters(Integer length, Integer width, Integer height, Integer dotsQuantity) {
        if (nonNull(length) || nonNull(width) || nonNull(height) || nonNull(dotsQuantity)) {
            this.length = length;
            this.width = width;
            this.height = height;
            this.dotsQuantity = dotsQuantity;
        }
        else {
            setRandomParameters();
        }
    }

    public void setRandomParameters() {
        length = (int) (1 + Math.random() * 3);
        width = (int) (1 + Math.random() * 3);
        height = (int) (1 + Math.random() * 3);
        dotsQuantity = (int) (1 + Math.random() * 1000);
    }
}

