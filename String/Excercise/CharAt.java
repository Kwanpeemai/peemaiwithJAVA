package String.Excercise;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int index = sc.nextInt();
        if (index-1 < text.length() && index > 0){
            char str = text.charAt(index-1);
            System.out.println(str);
        } else {
            System.out.println("invalid position");
        }
    }
}
