/*
POJ - laboratorium 2 2019-03-22
Grupa Maciej Rybacki i Jakub Biegała
Zadanie 3 - Program o trójkątach
*/

package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Triangle rownoramienny = new Triangle(3, 4, 4);
        Triangle rownoboczny = new Triangle(4, 4, 4);
        Triangle roznoboczny = new Triangle(3, 4, 5);
        System.out.println("Trojkat o bokach " + rownoramienny.getSide1() + ", " + rownoramienny.getSide2() + " i " + rownoramienny.getSide3() + " " + rownoramienny.isEquilateral() + ", " + rownoramienny.isIsosceles() + " i " + rownoramienny.isScalene() + ".");
        System.out.println("Trojkat o bokach " + rownoboczny.getSide1() + ", " + rownoboczny.getSide2() + " i " + rownoboczny.getSide3() + " " + rownoboczny.isEquilateral() + ", " + rownoboczny.isIsosceles() + " i " + rownoboczny.isScalene() + ".");
        System.out.println("Trojkat o bokach " + roznoboczny.getSide1() + ", " + roznoboczny.getSide2() + " i " + roznoboczny.getSide3() + " " + roznoboczny.isEquilateral() + ", " + roznoboczny.isIsosceles() + " i " + roznoboczny.isScalene() + ".");
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double start_side1, double start_side2, double start_side3) {
        side1 = start_side1;
        side2 = start_side2;
        side3 = start_side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getCircuit() {
        double s1 = getSide1();
        double s2 = getSide2();
        double s3 = getSide3();

        double circuit = s1 + s2 + s3;

        return circuit;
    }

    public double getArea() {
        double s1 = getSide1();
        double s2 = getSide2();
        double s3 = getSide3();
        double circuitHalf = getCircuit()/2;

        double area = Math.sqrt(circuitHalf*(circuitHalf-s1)*(circuitHalf-s2)*(circuitHalf-s3));

        return area;
    }

    public String isEquilateral() {
        double s1 = getSide1();
        double s2 = getSide2();
        double s3 = getSide3();
        String equilateral;

        if (s1 == s2 && s2 == s3) {
            equilateral = "jest rownoboczny";
        } else {
            equilateral = "nie jest rownoboczny";
        }

        return equilateral;
    }

    public String isIsosceles() {
        double s1 = getSide1();
        double s2 = getSide2();
        double s3 = getSide3();
        String isosceles;

        if (s1 == s2 || s2 == s3 || s1 == s3) {
            isosceles = "jest rownoramienny";
        } else {
            isosceles = "nie jest rownoramienny";
        }

        return isosceles;
    }

    public String isScalene() {
        double s1 = getSide1();
        double s2 = getSide2();
        double s3 = getSide3();
        String scalene;

        if (s1 != s2 && s2 != s3 && s1 != s3) {
            scalene = "jest roznoboczny";
        } else {
            scalene = "nie jest roznoboczny";
        }

        return scalene;
    }
}

