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

    void computePrice (int N, int landSize, int quality, int floors, int houseArea, int maxPrice, int minArea){
        boolean check = false;
        for (int i=0;i<N;i++){
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
        if (maxPrice<=price && minArea<=houseArea){
            System.out.println(landSize + " " +
            quality + " " + floors + " " +houseArea + " " + price);
            check = true;
        }
        }
        if (!check){
            System.out.println("none");
        }
    }

}

public class HousePrice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        House[] home = new House[N];
        for (int i=0;i<N;i++){
            int landSize = sc.nextInt();
            int quality = sc.nextInt();
            int floors = sc.nextInt();
            int houseArea = sc.nextInt();
            home[i] = new House(landSize, quality, floors, houseArea);
        }
        int maxPrice = sc.nextInt();
        int minArea = sc.nextInt();
        for (int i=0;i<N;i++){
            //home[i].computePrice(N, i, i, N, i, maxPrice, minArea); เรียกใช้ยังไง
        }

    }
}
