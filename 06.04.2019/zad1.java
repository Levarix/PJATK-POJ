/* Lab3,zad1 ,  Jakub Słomiński, Maciej Rybacki */

public class zad1 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    zad1(int id, String firstName, String lastName, int salary){
        id = 4;
        firstName = "Jakub";
        lastName = "słomiński";
        salary = 100;
    }

    public static void main(String args[]){


        zad1 employer = new zad1(4,"Jakub","Słomiński",100);

    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getname(){
        return firstName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){

    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int salary){
        return salary+(((int)(salary*0.01)));
    }

    public String tooString(){
        return "Employee[id= "+id+" ,name= "+firstName +" "+lastName+" ,salary= "+salary+"]";
    }
}
