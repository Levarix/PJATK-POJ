/*
 Laboratorium3, zadanie 7  Jakub Słomiński, Maciej Rybacki
*/

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {

        Palindrom Palindrom1 = new Palindrom("Atak kata");
        Palindrom Palindrom2 = new Palindrom("Muzo, raz daj jad za rozum");
        Palindrom Palindrom3 = new Palindrom("Wódy żal dla żydów");

        System.out.println(Palindrom1.sprawdzPalindrom());
        System.out.println(Palindrom2.sprawdzPalindrom());
        System.out.println(Palindrom3.sprawdzPalindrom());
        
    }
