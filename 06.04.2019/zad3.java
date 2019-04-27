/*
 Laboratorium3, zad3,  Jakub Slomiński, Maciej Rybacki */
public class zad3 {
    private String id;
    private String name;
    private int balance;


    public zad3 (String id, String name){
        id="1234";
        name="Account";

    }
    public zad3 (String id, String name,int balance){
        id="1234";
        name="Account";
        balance=4321;
    }

    public static void main(String args[]){


        zad3 s = new zad3("4321","Account",4321);
        zad3 s2 = new zad3("4321","Account");

    }

        public String getId(){
        return id;
        }

        public String getName(){
        return name;
        }

        public int getBalance(){
        return balance;
        }

        public int credit(int amount){
        balance = balance+amount;
        return balance;
        }

        int debit(int amount){
        if(amount<=balance){
            return amount/balance;
        }else{
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

        public int transfetTo(zad3 account, int amount){
            if(amount<=balance){
                account.balance=amount;
                return account.balance;
            }else{
                System.out.println("Amount exeeded balance");
                return balance;
            }
        }


    public String tooString(){
        return "Account[id= "+id+" ,name= "+name+" ,balance= "+balance+"]";
    }
}
