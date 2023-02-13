package Class.BasicClass;

import java.util.Scanner;

class Dept{
    int N;
    int K;
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    
    Dept(int N, int K){
        this.N = N;
        this.K = K;
    }
    void computerIncome(int N, int K){
        ministryBudget = (N*500000)+(K*3000);
        eduFee = K*5000;
        serviceFee = 300000;
        donation = 100000;
    }

    void printReport(){
        computerIncome(N, K);
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Dept dd = new Dept(N, K);
        dd.printReport();
    }
}
