/*
 Laboratorium3, zadanie 6  Jakub Słomiński, Maciej Rybacki
*/

public class zad6 {

     String name;
     int salary;
     String date;


    zad6(){

    }


    public static void main(String args[]){


        zad6[] pracownicy = new zad6[8];
        pracownicy[0]  = new zad6();
        pracownicy[0].setAll("Kuba",5600,"16/07/1987");
        pracownicy[1] = new zad6();
        pracownicy[1].setAll("Pawel",3400,"1/12/1998");
        pracownicy[2] = new zad6();
        pracownicy[2].setAll("Klaudia",1500,"8/09/2000");
        pracownicy[3] = new zad6();
        pracownicy[3].setAll("Magda",8300,"20/09/2001");
        pracownicy[4] = new zad6();
        pracownicy[4].setAll("Zbigniew",3900,"10/12/2003");
        pracownicy[5] = new zad6();
        pracownicy[5].setAll("Mariusz",2300,"12/07/1994");
        pracownicy[6] = new zad6();
        pracownicy[6].setAll("Tomasz",9100,"21/07/1992");
        pracownicy[7] = new zad6();
        pracownicy[7].setAll("Maciej",8500,"15/05/2000");

        zad6 listaPracownikow = new zad6();
        listaPracownikow.piszPracownikow(pracownicy);



    }
    void setAll(String nazwa,int wynagrodzenie, String dataZatrudnienia){
        name=nazwa;
        salary=wynagrodzenie;
        date=dataZatrudnienia;
    }

    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }
    String getDate(){
        return date;
    }

    void piszPracownikow(zad6 pracownicy[]) {
        for (int i = 0; i < 8; i++) {
            System.out.println("ID: "+(i+1)+" // "+(pracownicy[i]).getName()+" "+(pracownicy[i]).getSalary()+" "+(pracownicy[i]).getDate());
        }
    }
}
