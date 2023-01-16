package String.Excercise;

import java.util.Scanner;

public class Submatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        for (int i=0;i<text2.length()-2;i++){
            String str = text2.substring(i, i+3);
            if (text1.indexOf(str) != -1){
                System.out.println(text1.indexOf(str)+1);
            } else {
                System.out.println("No");
            }
        }
    }
}
