package String.String1;

import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i=0;i<text.length();i++){
            boolean check = false;
            if (Character.isLowerCase(text.charAt(i))){
                count1++;
                check = true;
            }
            if (Character.isUpperCase(text.charAt(i))){
                count2++;
                check = true;
            }
            if (!check){
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
