package MethodBasics.MB;

import java.util.Scanner;
import java.util.spi.ToolProvider;

class Employee {

    private int exWork;
    private int opWork;
    private String name;
    private String ID;
    private int type;
    private int money;
    private int payperh;
    private int payment;

    Employee(String name, String ID, int type, int money) {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.money = money;
        exWork = 0;
        opWork = 0;
        payperh = 0;
        payment = 0;
    }

    boolean workExecutive(int n) {
        if (n <= 0) {
            System.out.println("Invalid hour for executive work");
            
            return false;
        } else {
            exWork += n;
            
            return true;
        }

    }

    boolean workOperation(int m) {
        if (m <= 0) {
            System.out.println("Invalid hour for operation work");
        
            return false;
        } else {
            opWork += m;
            
            return true;
        }
    }

    int calPayment(){
        if(type == 1){
            payperh = (money*opWork*2) + (money*exWork);
        } 
        if (type == 2){
            payperh = (money*exWork*2) + (money*opWork);
        }
        payment += payperh;
        return payperh;
    }

    void printStats(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.print("Position: ");
        System.out.println((type == 1) ? "Executive" : "Operation");
        System.out.println("Ex Hour: " + exWork);
        System.out.println("Op Hour: " + opWork);
        System.out.println("Wage: " + money);
        System.out.println("Payment: " + payperh);
    }
}

public class HR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ID = scan.next();
        int type = scan.nextInt();
        int wage = scan.nextInt();
        Employee em = new Employee(name, ID, type, wage);
        final int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int workType = scan.nextInt();
            int hour = scan.nextInt();
            if(workType == 1){
                System.out.print(em.workExecutive(hour)+ " ");
            }
            if(workType == 2){
                System.out.print(em.workOperation(hour) + " ");
            }
            System.out.println(em.calPayment());
        }
        em.printStats();
    }
}