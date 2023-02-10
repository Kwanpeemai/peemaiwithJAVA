package Class.ArrayofObjects;

import java.util.Scanner;

class Item {
    boolean type;
    double weight;

    Item(boolean type, Double weight){
        this.type = type;
        this.weight = weight;
    }

    double saleprice (double pricegold){
        if (type){
            return (pricegold + 1000) * weight;
        } else {
            return pricegold * weight;
        }
    }

    double buyprice (double pricegold){
        if (type){
            return pricegold * weight * 0.98;
        } else {
            return (pricegold-100) * weight; 
        }
    }

    void showdetail (double pricegold){
        if (type){
            System.out.print("ornament " + weight + " baht");
        } else {
            System.out.print("bar " + weight + " baht");
        }
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t"))
                arrayx[i] = new Item(true, weight);
            else
                arrayx[i] = new Item(false, weight);
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }
    }
}
