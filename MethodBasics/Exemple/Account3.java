package MethodBasics.Exemple;

import java.util.Scanner;

public class Account3 {
    int balance = 10000;
    
        int deposit(int money){
            return money + balance;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account3 ac = new Account3();
        int max = ac.deposit(money);
        if (money>0){
        System.out.println(max);    
        } else if (money<=0){
            System.out.println("Error");
        }
        
    }
}
