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

    void bookRide() {
        ride = true;
        price += 40;
    }

    void bookSealShow() {
        seal = true;
        price += 50;
    }

    void bookTigerShow() {
        tiger = true;
        price += 65;
    }
    void summarize(){
        System.out.println(name);
        if(ride){
            System.out.println("Ride");
        }
        if(seal){
            System.out.println("Seal");
        }
        if(tiger){
            System.out.println("Tiger");
        }
        System.out.println(price);
    }
}

public class ZooTicket1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    ZooTicket ticket = new ZooTicket(name);
    while(true) {
      int service = scan.nextInt();
      if(service == 0){
        break ; 
      }
      if (service == 1){
        ticket.bookRide();
      }
      if (service == 2){
        ticket.bookSealShow();
      }
      if (service == 3){
        ticket.bookTigerShow();
      }
    }
    ticket.summarize();
    }
}
