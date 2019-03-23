/*
POJ - laboratorium 2 2019-03-22
Grupa: Maciej Rybacki i Jakub Biegała
Zadanie 4 - Program do szyfrowania za pomocą szyfru Cezara.
*/
package com.company;

import java.awt.print.Printable;
import java.util.Scanner;
import java.io.*;

class Encrypt {

    String imie;
    int shift;

    public Encrypt(String startImie, int startShift) {
        imie = startImie;
        shift = startShift;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void makeEncrypt() {
        for (int i = 0; i < this.imie.length(); i++) {
            char znak = imie.charAt(i);
            if (znak <= 122 && znak >= 97){
                znak += shift;
                if (znak > 122) {
                    znak -= 122;
                    znak += 96;
                }
            }else if (znak <= 90 && znak >= 65){
                znak += shift;
                if (znak > 90) {
                    znak -= 90;
                    znak += 64;
                }
            }
            System.out.print(znak);
        }
        System.out.println("\n---------------");
    }
}

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main (String[]args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj przesunięcie szyfru: ");
        int shift = in.nextInt();

        Encrypt encrypt1 = new Encrypt("Maciej", shift);
        Encrypt encrypt2 = new Encrypt("Jakub", shift);

       encrypt1.makeEncrypt();
       encrypt2.makeEncrypt();
    }
}

