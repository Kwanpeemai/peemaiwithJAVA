package Class.BasicClass;

import java.util.Scanner;

class Dept{
    int N;
    int K;
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;
    
    Dept(int N, int K){
        this.N = N;
        this.K = K;
        ministryBudget = (N*500000)+(K*3000);;
        eduFee = K*5000;
        serviceFee = 300000;
        donation =  100000;
        salary = N*600000;
        elec = (N+K)*2000;
        eduCost = K*4000;
    }
    int computerIncome(){
        int totalincome = (ministryBudget + eduFee + serviceFee + donation);
        return totalincome;
    }
    int computeExpense(){
        int totalexpense = (salary + elec + eduCost);
        return totalexpense;
    }

    void printReport(){
        System.out.println("total income = " + computerIncome());
        System.out.println("total expense = " + computeExpense());
        System.out.println("income - expense = " + (computerIncome()-computeExpense()));
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Dept dd = new Dept(N, K);
        dd.printReport();
    }
}
