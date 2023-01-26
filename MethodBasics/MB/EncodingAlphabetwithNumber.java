package MethodBasics.MB;

import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    static void text(int n, int i,String str, char num){
        if (num > 90) {
            char c = (char) (str.charAt(i)+n-26);
            System.out.print(c);
        } else {
            char c =(char) (str.charAt(i)+n);
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++){
            int n = sc.nextInt();
           char num = (char) (str.charAt(i)+n);
            text(n, i, str, num);
        }
    }
}
