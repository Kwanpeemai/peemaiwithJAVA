package MethodBasics.MB;

import java.util.Scanner;

class WaterTank {

    private int capacity;
    private int volume;

    WaterTank(int w, int l, int h){
        capacity = w*l*h;
        volume = 0;
    }

    int fill(int n){
        if (capacity < volume + n){
            System.out.println("Cannot fill the tank");
            return -1;
        } else {
            volume += n;
            return volume;
        }
    }
    
}
public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width, length, height);
        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            System.out.println(tank.fill(amount));
        } 
    }
}
