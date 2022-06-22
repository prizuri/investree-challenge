package com.investree;

public class Cubes {
    private double length;
    public Cubes(double length){
        this.length=length;
    }
    private double volume(){
        return length*length*length;
    }
    public void showVolume(){
        System.out.println(volume());
    }
}
