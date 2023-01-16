package String.String1;

import java.util.Scanner;


public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[100];
        int count = 0 ;
        while (true) {
            String text = sc.next();
            for (int i = 0; i < text.length(); i++) {
                arr[text.charAt(i)]++;
                for (int j = 65; j <= 91; j++) {
                    if (arr[j] == k) {
                        System.out.println((char) j);
                        System.out.println(count+1);
                        System.exit(0);
                    }
                }
            }
            count++;
        }
    }
}
