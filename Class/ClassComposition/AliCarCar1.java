package Class.ClassComposition;

import java.util.Scanner;

class Car {
    int ID;
    String name;
    int price;
    int labor;
    Car (int ID, String name, int price, int labor){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }
    static boolean check (String name, int price, int labor){
        if (name.length() != 0 && price > 0 && labor > 0) {
            return true;
        } else {
            return false;    
        }  
    }

}

public class AliCarCar1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    Car[] cars = new Car[N];
    int count = 0;
    for(int i = 0; i < N; ++i) {
      String name = scan.next();
      int price = scan.nextInt();
      int labor = scan.nextInt();
      cars[i] = new Car(i, name, price, labor);
      if(name.length() != 0 && price > 0 && labor > 0) {
        cars[i].check(name, price, labor);  
        System.out.println("valid");
        count++;
      } else {
        System.out.println("invalid");
      }
}
   for(int i=0;i<count;i++){
        System.out.println(i+1 + " " + cars[i].name);
   }
       
}
}