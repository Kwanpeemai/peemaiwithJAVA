package Class.ArrayofObjects;

import java.util.ArrayList;
import java.util.Scanner;

class Runner {
    String name;
    int type;
    String prefix;
    int id;
    static int sum = 0;
    Runner (String name, int type){
        this.name = name;
        this.type = type;
        if ( type == 1 ) prefix = "A";
        else if ( type == 2 ) prefix = "B";
        else if ( type == 3 ) prefix = "C";
        else if ( type == 4 ) prefix = "D";
        else return;
        sum++;
        id = sum;
    }
    String GetBIB(){
        String BIB = prefix;
        if (id < 10) BIB += ("00" + id);
        else if (id < 100) BIB += ("0" + id);
        return BIB;
    }


    void printInfo() {
        if (type < 1 || type > 4) System.out.println("INVALID");
        else System.out.println(GetBIB() + " " + name);
    }
}

public class Marathon12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Runner> rn = new ArrayList<>();
        int[] count = new int[5];
        for (int i=0 ; i<N ; i++){
            String name = sc.next();
            int type = sc.nextInt();
            rn.add(new Runner(name, type));
            if (type>=1 && type<=4) 
                count[type]++;
        }
        for (int i=1 ; i<=4 ;i++){
            System.out.println(count[i]);
            if (count[i] == 0) System.out.println("-");
            else {
                for (Runner r: rn){
                if (r.type == i) System.out.print(r.GetBIB() + " ");
                }
                System.out.println();
            }
        }
    }
}
