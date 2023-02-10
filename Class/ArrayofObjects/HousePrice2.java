package Class.ArrayofObjects;

import java.util.Scanner;

class House {
    public int landSize;
    public int quality;
    public int floors;
    public int houseArea;
    public int price;

    int computerPrice (int landSize, int quality, int floors, int houseArea){
        int qualprice = 0;
        if (quality == 1) qualprice = houseArea*10000;
        else if (quality == 2) qualprice = houseArea * 8000;
        else if (quality == 3) qualprice = houseArea * 5000;
        return (landSize * 10000) + qualprice + (200000 * (floors-1));
    }

    House (int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computerPrice(landSize, quality, floors, houseArea);
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
        int count = 0;
        for (int i=0;i<N;i++){
            House homehome = home[i];
            if (maxPrice >= homehome.price && minArea <= homehome.houseArea){
                System.out.println(homehome.landSize + " " +
                homehome.quality + " " + homehome.floors + " " +homehome.houseArea + " " + homehome.price);
                count++;
            }
        }
        if (count == 0){
            System.out.println("none");
        }

    }
}
