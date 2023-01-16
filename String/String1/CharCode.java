package String.String1;

import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        char c = tmp.charAt(0);
        int valC = (int) c;
        System.out.println(valC);
    }
}
