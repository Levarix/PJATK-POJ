/*
POJ - laboratorium 2 2019-03-22
Grupa Maciej Rybacki i Jakub Biegała
Zadanie 2 - Program obliczający pole, obwód i przekątną prostokąta
*/

package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.print("Prostokat o bokach ");
        System.out.print(rectangle.getWidth() + " i " + rectangle.getHeight());
        System.out.print(" ma pole " + rectangle.getArea() + ", obwod " + rectangle.getCircuit() + " i przekatna " + rectangle.getDiagonal() + ".");
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double start_width, double start_height) {
        width = start_width;
        height = start_height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double w = getWidth();
        double h = getHeight();

        double area = w * h;

        return area;
    }

    public double getCircuit() {
        double w = getWidth();
        double h = getHeight();

        double circuit = 2 * (w + h);

        return circuit;
    }

    public double getDiagonal() {
        double w = getWidth();
        double h = getHeight();

        double diagonal = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

        return diagonal;
    }
}
