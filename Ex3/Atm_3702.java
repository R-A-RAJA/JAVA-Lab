package Lab.Ex3;

import java.util.Scanner;

class Account{
        int[] acc_no={11,12,13,14,15};
        double[] balance ={100,200,20,30,40};
        String[] name={"athi","deepak","mani","nithesh","suresh"};

        void check_balance(int a){
            for (int i=0; i< acc_no.length;i++){
                if (a==acc_no[i]) {
                    System.out.println("Account no: "+a);
                    System.out.println("Name: "+name[i]);
                    System.out.println("Balance: "+balance[i]);
                }
            }
        }
        void withdraw(int a,double b){
            for (int i=0; i< acc_no.length;i++){
                if (a==acc_no[i]) {
                    if (balance[i]>=b) {
                        System.out.println("Account no: "+a);
                        System.out.println("Name: "+name[i]);
                        System.out.println("Withdraw successful!");
                        System.out.println("Old Balance: " + balance[i]);
                        balance[i]=balance[i]-b;
                        System.out.println("New Balance: " + balance[i]);
                    }
                    else{
                        System.out.println("Not able to withdraw.");
                    }
                }
            }
        }
        void deposit(int a,double b){
            for (int i=0; i< acc_no.length;i++){
                if (a==acc_no[i]) {
                        System.out.println("Account no: "+a);
                        System.out.println("Name: "+name[i]);
                        System.out.println("Deposit successful!");
                        System.out.println("Old Balance: " + balance[i]);
                        balance[i]=balance[i]+b;
                        System.out.println("New Balance: " + balance[i]);
                }
            }
        }

}

public class Atm_3702 {
    public static void main(String args[]){
        System.out.println("Name: ATHITHRAJA. R");
        System.out.println("Regno: 2022503702");
        Account display=new Account();
        System.out.println("_________________________________________________");
        display.check_balance(14);
        System.out.println("_________________________________________________");
        display.withdraw(14,3);
        System.out.println("_________________________________________________");
        display.deposit(14,3);
        System.out.println("_________________________________________________");
    }
}
