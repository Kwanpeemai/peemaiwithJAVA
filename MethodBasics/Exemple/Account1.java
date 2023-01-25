package MethodBasics.Exemple;

import java.util.Scanner;

public class Account1 {
    int balance = 10000;
    
        int deposit(int money){
            return money + balance;
            
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account1 ac = new Account1();
        int max = ac.deposit(money);
        System.out.println(max);
    }
}
