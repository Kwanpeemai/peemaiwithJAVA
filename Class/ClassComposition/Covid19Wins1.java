package Class.ClassComposition;

import java.util.Scanner;

class Visitation {
    int id;
    int date;
    int[] hour;
    
    Visitation (int id, int date){
        this.id = id;
        this.date = date;
        hour = new int[24];
    }

    void visit (int k){
        if (k < 0 || k > 23){
            System.out.println("invalid hour: " + k);
        } else {
            hour[k]++;
        }
    }

    int count (){
        int count = 0;
        for (int i=0;i<=23;i++){
            if (hour[i] > 0){
                count += hour[i];
            }
        }
        return count;
    }

    void printVisitHours(){
        System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        if (count() == 0){
            System.out.println("no visit");
        } else {
            for (int i=0;i<=23;i++){
                if (hour[i] > 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

public class Covid19Wins1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int id = scan.nextInt();
    int date = scan.nextInt();
    Visitation visitation = new Visitation(id, date);
    final int K = scan.nextInt();
    for (int i=0;i<K;i++){
        int k = scan.nextInt();
        visitation.visit(k);
    }
    visitation.printVisitHours();
    }
}
