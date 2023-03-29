package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<Character> count1 = new ArrayList<Character>();
        ArrayList<Character> count2 = new ArrayList<Character>();
        ArrayList<Character> count3 = new ArrayList<Character>();
        for (int i=0;i<str.length();i++){
            Character t = (char) str.charAt(i);
            if (Character.isLowerCase(t)){
                count1.add(t);
            }else if (Character.isUpperCase(t)){
                count2.add(t);
            } else {
                count3.add(t);
            }
        }
         
        for (int i=0;i<count1.size();i++){
            System.out.print(count1.get(i));
        }System.out.println();
        for (int i=0;i<count2.size();i++){
            System.out.print(count2.get(i));
        }System.out.println();
        for (int i=0;i<count3.size();i++){
            System.out.print(count3.get(i));
        }System.out.println();
        System.out.println("Hello");
    }
}
