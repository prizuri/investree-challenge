package com.investree;

public class Triangle {
    private double length, height;
    public Triangle(double length, double height){
        this.length=length;
        this.height=height;
    }
    private double area(){
        return length*height/2;
    }
    public void showArea(){
        System.out.println(area());
    }
}
