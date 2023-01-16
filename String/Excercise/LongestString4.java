package String.Excercise;

import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = "";
        for (int i=0;;i++){
            String text = sc.nextLine();
            if (text.length()==0){
                break;
            }
            if (text.length() >= max){
                max = text.length();
                longestStr = text;
            }     
        }
         System.out.println(longestStr);
    }
}
