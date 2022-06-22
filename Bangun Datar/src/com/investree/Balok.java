package com.investree;

public class Balok {
    private double length,  width, height;
    public Balok(double length, double width, double height) {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    private double volume(){
        return length*width*height;
    }
    public void showArea(){
        System.out.println(volume());
    }
}
