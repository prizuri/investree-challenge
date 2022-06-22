package com.investree;

import java.util.Scanner;

public class CalculateShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode bentuk 1: untuk balok, 2: untuk kubus, 3: untuk triangle");
        int shape = input.nextInt();
        switch (shape){
            case 1:
                Balok balok = new Balok(2,3,4);
                balok.showArea();
                break;
            case 2:
                Cubes cubes = new Cubes(2);
                cubes.showVolume();
                break;
            case 3:
                Triangle triangle=new Triangle(2,4);
                triangle.showArea();
            default:
                break;
        }
    }
}
