package MethodBasics.MB;
import java.util.Scanner;

class TankObserver {
    
    private int capacity;
    private int volume;
    
    TankObserver(int w, int l, int h){
        
        capacity = w * l * h;
        
        volume = 0;
    }

    int fill(int n){
        if(capacity < volume + n){
            System.out.println("Cannot fill the tank");
            return -1;
        }
        else {
            volume += n;
            return volume;
        }
    }

}
public class WaterTank {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int w = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();
            TankObserver to = new TankObserver(w, l, h);
            for (int i=0;i<5;i++){
                int a = sc.nextInt();
                System.out.println(to.fill(a));
            }

        }
}

