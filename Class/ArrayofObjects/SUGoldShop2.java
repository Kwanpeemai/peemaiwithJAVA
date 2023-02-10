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

public class SUGoldShop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pricegold = sc.nextDouble();
        double totalsaleweight = 0;
        double totalsaleprice = 0;
        double totalbuyweight = 0;
        double totalbuyprice = 0;
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = sc.next();
            String attgold = sc.next();
            double weight = sc.nextDouble();
            Item gold = null;
            if (cmdline.equalsIgnoreCase("s")){
                totalsaleweight += weight;
                if (attgold.equalsIgnoreCase("t")){
                    gold = new Item(true, weight); 
                    totalsaleprice += gold.saleprice(pricegold);  
                } else {
                    gold = new Item(false, weight);
                    totalsaleprice += gold.saleprice(pricegold);
                }
            } else {
                totalbuyweight += weight;
                if (attgold.equalsIgnoreCase("t")){
                    gold = new Item(true, weight); 
                    totalbuyprice += gold.buyprice(pricegold);  
                } 
                else {
                    gold = new Item(false, weight);
                    totalbuyprice += gold.buyprice(pricegold);
                }
            }
    }
    
    System.out.println(totalsaleweight + " " + totalsaleprice);
    System.out.println(totalbuyweight + " " + totalbuyprice);
}
}

