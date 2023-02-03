package Class.ArrayofObjects;

import java.util.Scanner;

class Bus{
    public String id;
    public int type;
    public int seats;
    public int book;

    Bus(String id, int type, int seats){
        this.id = id;
        this.type = type;
        this.seats = seats;
        book = 0;
    }

    void printStats(){
        boolean check = false;
        System.out.println(id);
        if (type == 1){
            System.out.println("Fan");
        } else if (type == 2){
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        if (book <= 0){
            System.out.println("0" + " " + seats);
            check = true;
            System.out.println("Active");
        }
        if (!check){
            System.out.println("Inactive");
        }
    }
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int type = sc.nextInt();
        int seats = sc.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
