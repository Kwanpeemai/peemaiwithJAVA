package String.String2;

import java.util.Scanner;

public class ABC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for (int i=0;i<text.length()-2;i++){
            if (text.charAt(i)+1 == text.charAt(i+1) && text.charAt(i+1)+1 == text.charAt(i+2)){
                count++;
            }
        }
            System.out.println(count);
    }
}
