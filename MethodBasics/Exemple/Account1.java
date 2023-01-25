package MethodBasics.Exemple;

import java.util.Scanner;

public class Account1 {
    Scanner sc = new Scanner(System.in);
    int money = sc.nextInt();
    int balance = 10000;
    
        int deposit(){
            return money + balance;
        }
    
    public static void main(String[] args) {
        Account1 ac = new Account1();
        int max = ac.deposit();
        System.out.println(max);
    }
}
