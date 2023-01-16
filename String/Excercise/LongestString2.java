package String.Excercise;

import java.util.Scanner;

public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String str = "";
        for (int i=0;i<5;i++){
            String text = sc.nextLine();
            if (text.length()>max){
                max = text.length();
                str = text;
            }
        }
        System.out.println(str);
   }
}
