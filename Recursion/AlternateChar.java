package Recursion;

import java.util.Scanner;

import java.util.Scanner;

public class AlternateChar {

    String alterMerge(String s1, String s2, int order) {
        if (s1.length() == 0) return s2;
        if (order == 1) return s1.charAt(0) + alterMerge(1, s1.length(), order)
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int order = scan.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}