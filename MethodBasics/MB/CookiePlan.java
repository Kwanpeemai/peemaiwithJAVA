package MethodBasics.MB;

import java.util.Scanner;

public class CookiePlan { 
    private static int count = 0;
    static void planCookie(int N, int[] flours, int[] butters) {
    for (int i=0;i<N;i++){
        if (flours[i] < 60 || butters[i] < 30){
            System.out.println(i+1);
            count++;
            flours[i] = 0;
            butters[i] = 0;  
        }
    } 
        System.out.println("There are " + count + " days that ingredients are insufficient");
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for (int i=0;i<N;i++){
            flours[i] = scan.nextInt();
            butters[i] = scan.nextInt();
        }
        CookiePlan CP = new CookiePlan();
        CP.planCookie(N, flours, butters);
    } 
}
   
