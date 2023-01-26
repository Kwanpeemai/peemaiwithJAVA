package MethodBasics.MB;

import java.util.Scanner;

public class BgReport {
    static void reportBg(String name, int birthYear, int startYear) {
        //name
        if (name.length() < 2) {
            System.out.println("Name: INVALID");
        } else {
            System.out.println("Name: " + name);
        }
        //birth
        if (birthYear >= 1900 && birthYear <= 2022) {
            System.out.println("Birth year: " + birthYear);
            if (startYear >= 1900 && startYear <= 2022){
                if (startYear-birthYear>17){
                    System.out.println("Start year: " + startYear);
                } else {
                    System.out.println("Start year: INVALID");
                }
            } else {
                System.out.println("Start year: INVALID");
            }
        } else {
            System.out.println("Birth year: INVALID");
            if (startYear >= 1900 && startYear <= 2022){
                if (startYear-birthYear>17){
                    System.out.println("Start year: INVALID");
                } else {
                    System.out.println("Start year: INVALID");
                }
            } else {
                System.out.println("Start year: INVALID");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthYear = scan.nextInt();
        int startYear = scan.nextInt();
        BgReport BR = new BgReport();
        BR.reportBg(name, birthYear, startYear);

    }
}
