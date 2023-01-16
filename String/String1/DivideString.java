package String.String1;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        for (int i=0;i<text.length();i++){
            if (Character.isLowerCase(text.charAt(i))){
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
        for (int i=0;i<text.length();i++){
            if (Character.isUpperCase(text.charAt(i))){
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
        for (int i=0;i<text.length();i++){
            if (!Character.isLowerCase(text.charAt(i)) && !Character.isUpperCase(text.charAt(i))){
                System.out.print(text.charAt(i));
            }
        }
    }
}
