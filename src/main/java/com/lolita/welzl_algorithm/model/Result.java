package com.lolita.welzl_algorithm.model;

public class Result {
    private Object circle;
    private double minZ;
    private double maxZ;
    private int numberOfDots;
    private double time;

    public Object getCircle() {
        return circle;
    }

    public void setCircle(Object circle) {
        this.circle = circle;
    }

    public double getMinZ() {
        return minZ;
    }

    public void setMinZ(double minZ) {
        this.minZ = minZ;
    }

    public double getMaxZ() {
        return maxZ;
    }

    public void setMaxZ(double maxZ) {
        this.maxZ = maxZ;
    }

    public int getNumberOfDots() {
        return numberOfDots;
    }

    public void setNumberOfDots(int numberOfDots) {
        this.numberOfDots = numberOfDots;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Result(Object circle, double minZ, double maxZ, int numberOfDots, double time) {
        this.circle = circle;
        this.minZ = minZ;
        this.maxZ = maxZ;
        this.numberOfDots = numberOfDots;
        this.time = time;
    }
}
