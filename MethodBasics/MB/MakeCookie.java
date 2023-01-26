package MethodBasics.MB;

import java.util.Scanner;

public class MakeCookie { 
    static void calCookieBags(int flour,int butter) {
        int a = flour/6;
        int b = butter/3;
        if (flour < 0 || butter <0 || flour > 100000 || butter > 100000){
            System.out.println("Cookie bags: Error");
            if (flour > 0 && (butter < 0 || butter > 100000)){
            System.out.println("Flour left: " + flour);
            System.out.println("Butter left: Invalid");    
            }
            if ((flour < 0 || flour > 100000) && butter > 0){
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: " + butter);   
            }
            if (flour < 0 && butter < 0){
                System.out.println("Flour left: Invalid");
                System.out.println("Butter left: Invalid");   
            }
           
        } else if (a<=b) {
            System.out.println("Cookie bags: " + a);
            if (flour-(a*6)>=0){
                System.out.println("Flour left: " + (flour-(a*6)));
                System.out.println("Butter left: " + (butter-(a*3)));
            }
        } else if (b<=a) {
            System.out.println("Cookie bags: " + b);
            if (butter-(b*3)>=0){
                System.out.println("Flour left: " + (flour-(b*6)));
                System.out.println("Butter left: " + (butter-(b*3)));
            }
        }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flour = scan.nextInt();
        int butter = scan.nextInt();
        MakeCookie MK = new MakeCookie();
        MK.calCookieBags(flour, butter);
} 
}