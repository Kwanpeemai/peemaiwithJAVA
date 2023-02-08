package Class.ArrayofObjects;

import java.util.Scanner;

class Bus {
    public String id;
    public int type;
    public int seats;
    public int capacity;
    boolean status;
    
    Bus(String id, int type, int capacity){
        this.id = id;
        this.type = type;
        this.capacity = capacity;
        seats = 0;
        status = true;
    }
    
    void printStats(){
        System.out.println(id);
        if (type == 1){
            System.out.println("Fan");
        } else if (type == 2){
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(seats + " " + capacity);
        System.out.println((status) ? "Active" : "Inactive");
    }
    
    boolean reserve(int k){
        if(k + seats > capacity || k < 0 || !status){
            return false;
        }
        else {
            seats += k;
            return true;
        }
    }
    
    void sendToRepair(){
        status = false;
    }
    
    void backToService(){
        status = true;
    }
}

public class BusCompany2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                b.reserve(K);
            } else if (P == 2) {
                b.sendToRepair();
            } else if (P == 3) {
                b.backToService();
            }
            b.printStats();
        }
    }
}
