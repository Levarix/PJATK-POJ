/* 
POJ - laboratorium 2 2019-03-22
Grupa: Maciej Rybacki i Jakub Biegała
Zadanie 1 - Program z klasą reprezentującą człowieka.
*/
package com.company;


class Human {

    private int age;
    private double weight;
    private double height;
    private String name;
    private boolean  isMale;
    private int index_number;
    private double feet_size;



    public Human(int startAge, double startWeight, double startHeight, String startName, boolean startIsmale, int startIndex_number, double start_Feet_size) {
        age = startAge;
        weight = startWeight;
        height = startHeight;
        name = startName;
        isMale = startIsmale;
        index_number = startIndex_number;
        feet_size = start_Feet_size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFeet_size(double feet_size) {
        this.feet_size = feet_size;
    }

    public void setIndex_number(int index_number) {
        this.index_number = index_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean isMale) {
        this.isMale = isMale;
    }


    public double getFeet_size() {
        return feet_size;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getIndex_number() {
        return index_number;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }
}

public class Main {

    public static void main (String[]args) {
    Human person1 = new Human (20, 85, 178, "Maciej", true, 18553, 44.5);
    Human person2 = new Human(29,67,183,"Jakub", true, 18503, 43);

    System.out.println("Age = " + person1.getAge() + "\n" + "Weight = " + person1.getWeight() + "\n" + "Height = " + person1.getHeight() + "\n" + "Name = " + person1.getName() + "\n" + "Is Male? = " + person1.isMale() + "\n" + "Feet size = " + person1.getFeet_size() + "\n" + "Index Number = " + person1.getIndex_number() + "\n");
    System.out.println("----------------------------------------------");
    System.out.println("Age = " + person2.getAge() + "\n" + "Weight = " + person2.getWeight() + "\n" + "Height = " + person2.getHeight() + "\n" + "Name = " + person2.getName() + "\n" + "Is Male? = " + person2.isMale() + "\n" + "Feet size = " + person2.getFeet_size() + "\n" + "Index Number = " + person2.getIndex_number() + "\n");

    }
}
