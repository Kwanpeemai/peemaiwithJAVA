package Class.BasicClass;

import java.util.Scanner;

class ZooTicket {
    private String name;
    private int price;
    private boolean ride;
    private boolean seal;
    private boolean tiger;

    ZooTicket(String name) {
        this.name = name;
        ride = false;
        seal = false;
        tiger = false;
        price = 100;
    }

    boolean bookRide() {
        seal = true;
    }

    void bookSealShow() {
        seal = true;
    }

    void bookTigerShow() {
        tiger = true;

    }

    void summarize() {
        System.out.println(name);
        if (ride) {
            System.out.println("Ride");
            price += 40;
        }
        if (seal) {
            System.out.println("Seal");
            price += 50;
        }
        if (tiger) {
            System.out.println("Tiger");
            price += 65;
        }
        System.out.println(price);
    }

        boolean useRide() {
            ride = false;
            return false;
        }

        boolean enterSealShow() {
            seal = false;
            return false;
        }
        boolean enterTigerShow() {
            tiger = false;
            return false;
        }
}

public class ZooTicket2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    ZooTicket ticket = new ZooTicket(name);
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
    int service2 = scan.nextInt();
        if (service2 == 1){
            ticket.useRide();
        }
        if (service2 == 2){
            ticket.enterSealShow();
        }
        if (service2 == 3){
            ticket.enterTigerShow();
        }
    }
}
}