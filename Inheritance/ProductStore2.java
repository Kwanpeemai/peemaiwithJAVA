package Inheritance;

import java.util.Scanner;

class Product {
    String name;
    String sku;
    double prices;
    int weight;
    boolean valid;

    Product(String name, String sku, double prices, int weight) {
        this.name = name;
        this.sku = sku;
        this.prices = prices;
        this.weight = weight;
        valid = true;
    }

    boolean checkValidity() {
        if (name==null || name.length()==0 || sku==null || sku.length()==0 || prices<0 || weight<0){
            valid = false;
        } else {
            valid = true;
        }
        if (name==null || name.length()<=0) {
            System.out.println("name is invalid");
        }
        if (sku==null || sku.length()<=0) {
            System.out.println("sku is invalid");
        }
        if (prices<0.0) {
            System.out.println("price is invalid");
        }
        if (weight<0) {
            System.out.println("weight is invalid");
        }
        return valid;
    }
    void printInfo(){
            if (!valid){
                System.out.print(name + ", " + sku + ", " + prices + ", " + weight);
                System.out.print(", Invalid");
                System.out.println();
            } else {
                System.out.println(name + ", " + sku + ", " + prices + ", " + weight);
            }
        
    }
}

class Shoe extends Product {
    int gender;
    int size;
    int type;
    String brand;

      Shoe(String name, String sku, double prices, int weight, int gender, int size, int type, String brand){
        super(name, sku, prices, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
      }
      void printInfo(){
        super.printInfo();
        String G = (gender == 1) ? "female" : "male";
        String T = (type == 1) ? "sport" : (type == 2) ? "formal" : "casual";
        System.out.println(G + ", " + size + ", " + T + ", " + brand);
      }
}

public class ProductStore2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    Product[] PD = new Product[N];
    for(int i = 0; i < N; ++i) {
      scan.nextLine(); // throw away new-line char
      String name = scan.nextLine();
      String sku = scan.nextLine();
      double prices = scan.nextDouble();
      int weight = scan.nextInt();
      int gender = scan.nextInt();
      int size = scan.nextInt();
      int type = scan.nextInt();
      String brand = scan.next();
      PD[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
}
// Call checkVaidity of each product object. 
for(int i = 0; i < N; ++i) {
      Boolean valid = PD[i].checkValidity();
      System.out.println(valid);
    }
    // Call printInfo of each product object.
    for(int i = 0;i<N;++i){
        PD[i].printInfo();
    }
}
}