package Class.ArrayofObjects;

import java.util.Scanner;

class House {
    public int landSize;
    public int quality;
    public int floors;
    public int houseArea;
    public int price;

    House (int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = 0;
    }
    int computePrice (int landSize, int quality, int floors, int houseArea){
       price += 10000*landSize;
       if (quality == 1){
        price += 10000*houseArea;
       }
       if (quality == 2){
        price += 8000*houseArea;
       }
       if (quality == 3){
        price += 5000*houseArea;
       }
       if (floors>1){
        price += 200000*(floors-1);
        }
       return price;
    }
}

public class HousePrice1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int landSize = scan.nextInt();
    int quality = scan.nextInt();
    int floors = scan.nextInt();
    int houseArea = scan.nextInt();
    House house = new House(landSize, quality, floors, houseArea);
    System.out.println(house.landSize + " " +
      house.quality + " " + house.floors + " " +house.houseArea);
    System.out.println(house.computePrice(landSize, quality, floors, houseArea));
  }
}
