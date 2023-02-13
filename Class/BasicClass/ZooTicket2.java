package Class.BasicClass;

import java.util.Scanner;

class ZooTicket1 {
    private String name;
    private int sumR;
    private int sumS;
    private int sumT;

    ZooTicket1(String name) {
        this.name = name;
        sumR = 0;
        sumS = 0;
        sumT = 0;
    }

    void bookRide() {
        sumR += 40;
    }

    void bookSealShow() {
        sumS += 50;
    }

    void bookTigerShow() {
        sumT += 65;

    }

    void summarize() {
        int sum = 100;
        System.out.println(name);
        if (sumR == 40) {
            System.out.println("Ride");
            sum += sumR;
        }
        if (sumS == 50) {
            System.out.println("Seal");
            sum += sumS;
        }
        if (sumT == 65) {
            System.out.println("Tiger");
            sum += sumT;
        }
        System.out.println(sum);
    }

        String useRide() {
            if (sumR == 40){
                sumR = 0;
                return "okay\ntrue";
            } else {
                return "no\nfalse";
            }
        }

        String enterSealShow() {
            if (sumS == 50){
                sumS = 0;
                return "okay\ntrue";
            } else {
                return "no\nfalse";
            }
        }
        String enterTigerShow() {
            if (sumT == 65){
                sumT = 0;
                return "okay\ntrue";
            } else {
                return "no\nfalse";
            }
        }
}

public class ZooTicket2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    ZooTicket1 ticket = new ZooTicket1(name);
    while(true) {
      int service1 = scan.nextInt();
      if(service1 == 0){
        break ; 
      }
      if (service1 == 1){
        ticket.bookRide();
      }
      if (service1 == 2){
        ticket.bookSealShow();
      }
      if (service1 == 3){
        ticket.bookTigerShow();
      }
    }
    ticket.summarize();
    
    int Q = scan.nextInt();
    for (int i=0;i<Q;i++){
    int service1 = scan.nextInt();
        if (service1 == 1){
           System.out.println(ticket.useRide());
        }
        if (service1 == 2){
            System.out.println(ticket.enterSealShow());
        }
        if (service1 == 3){
            System.out.println(ticket.enterTigerShow());
        }
    }
}
}