public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Iwona", "Sezamkowa 16");
        Person p2 = new Person("Maciej", "Fiołkowa 3/3");
        Staff s1 = new Staff("Autonomik",1200,"Adam","Rycersa 8");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(s1.toString());
    }
}
