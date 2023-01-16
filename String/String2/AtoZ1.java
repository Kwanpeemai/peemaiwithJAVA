package String.String2;

import java.util.Scanner;

public class AtoZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int a = text.lastIndexOf("A");
        int z = text.indexOf("Z");

        if (a<z){
            for (int i=a;i<=z;i++){
                System.out.print(text.charAt(i));
            }
        } else {
            for (int i=a;i>=z;i--){
                System.out.print(text.charAt(i));
            }
        }
    }
}
