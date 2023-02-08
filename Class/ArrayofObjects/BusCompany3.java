package Class.ArrayofObjects;

import java.util.Scanner;

class Bus3 {
    public String id;
    public int type;
    public int seats;
    private int capacity;
    private boolean status;

    Bus3(String id, int type, int seats){
        this.id = id;
        this.type = type;
        this.seats = seats;
        capacity = 0;
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
        System.out.println(capacity + " " + seats);
        System.out.println((status) ? "Active" : "Inactive");
    }

    boolean reserve(int k){
        if(k + capacity > seats || k < 0 || !status){
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

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus3[] bus = new Bus3[Q];
        for (int i=0;i<Q;i++){
            String id = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            bus[i] = new Bus3(id, type, seats);
        }
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();
            if (P == 1){
                boolean check = false;
                for (int j=0;j<Q;j++){
                    if (T == bus[j].type){
                        if (bus[j].reserve(K)){
                            System.out.println(bus[j].id);
                            check = true;
                            break;
                        }
                    }
                }
                if (!check){
                    System.out.println("sorry");
                }
            } else if (P == 2){
                bus[T-1].sendToRepair();
            } else if (P == 3){
                bus[T-1].backToService();
            }
        }
    }
}
