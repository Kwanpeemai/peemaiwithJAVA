package String.String1;

import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }                         
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int count1 = 0;
        int count2 = 0;
        int noncount = 0;
        for (int i=0;i<n;i++){
            boolean check = false;
            if (arr[i]>=x1 && arr[i]<=x2){
                count1++;
                check = true;
            }
            if (arr[i]>=y1 && arr[i]<=y2){
                count2++;
                check = true;
            }
            if(!check){
                noncount++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(noncount);
    }
}
