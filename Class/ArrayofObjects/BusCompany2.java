package Class.ArrayofObjects;

import java.util.Scanner;

class Bus1 {
    public String id;
    public int type;
    public int seats;
    public int book;

    Bus1(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        book = 0;
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
    }

    boolean reserve(int k){
        if (k < seats){
            if (k>0){
            book += k;    
            }
            System.out.println(book + " " + seats);
            System.out.println("Active");
            return true;
        } else {
            System.out.println(book + " " + seats);
            System.out.println("Inactive");
            return false;
        }
    }
    
    void sendToRepair(){
        System.out.println(book + " " + seats);
        System.out.println("Inactive");
    }
    void backToService(){
        System.out.println(book + " " + seats);
        System.out.println("Active");
    }
}

    public class BusCompany2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            Bus1 b = new Bus1(id, type, seats);

            int N = sc.nextInt();
            for (int i = 0; i < N; ++i) {
                int P = sc.nextInt();
                int K = sc.nextInt();
                b.printStats();
                if(P==1) 
                    b.reserve(K);
                else if(P==2)
                    b.sendToRepair();
                else if(P==3)
                    b.backToService();
            }
        }
    }
