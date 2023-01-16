package Array2D;

import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for (int i=1;i<=k;i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           if (a > 0 && b > 0 && a<=r && b<=c){
               count1++;
           }else{
               count2++;
           }
        }
        System.out.println(count1);
        System.out.println(count2);
        
    }
}
