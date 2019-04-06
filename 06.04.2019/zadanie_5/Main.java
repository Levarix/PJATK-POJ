/*
POJ - laboratorium 3 2019-04-06
Grupa: Maciej Rybacki i Jakub Słomiński
Zadanie 2
*/
public class Main {

    public static void main(String[] args) {
        Time time1 = new Time (16,59,59);
        System.out.println(time1.toString());
        System.out.println(time1.nextSecond());
        System.out.println(time1.previousSecond());
    }
}
