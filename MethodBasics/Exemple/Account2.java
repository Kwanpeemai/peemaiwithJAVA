package MethodBasics.Exemple;

import java.util.Scanner;

public class Account2 {
    static int balance = 10000;
    
        void deposit(int money){
            balance = money + balance;
            //System.out.println(balance);
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account2 ac = new Account2();
        ac.deposit(money);
        System.out.println(balance);
    }
}
