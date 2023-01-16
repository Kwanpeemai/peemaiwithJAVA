package String.String1;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int[] arr = new int[100];
        for (int i=0;i<text.length();i++){
            arr[text.charAt(i)]++;
        }
        for (int i=65;i<=91;i++){
            if (arr[i]!=0){
                System.out.println((char) i +" "+arr[i]);
            }
        }
    }
}
