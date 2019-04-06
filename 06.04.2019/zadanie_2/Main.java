/* 
POJ - laboratorium 3 2019-04-06
Grupa: Maciej Rybacki i Jakub Słomiński 
Zadanie 2
*/
public class Main {
    public static void main(String[] args){
        InvoiceItem invoice1 = new InvoiceItem("0", "Cornflakes", 5, 6.50);
        InvoiceItem invoice2 = new InvoiceItem("1", "Milk", 10, 2);
        InvoiceItem invoice3 = new InvoiceItem("2", "Honey", 16, 24);

        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());
        System.out.println(invoice3.toString());


        System.out.println("Total invoice 1: "+invoice1.getTotal());
        System.out.println("Total invoice 2: "+invoice2.getTotal());
        System.out.println("Total invoice 3: "+invoice3.getTotal());
    }
}
