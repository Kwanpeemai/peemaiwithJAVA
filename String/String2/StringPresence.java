package String.String2;

import java.util.Scanner;

public class StringPresence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0;i<n;i++){
            str[i] = sc.next();
        }
        String text = sc.next();
        boolean check = false;
        for (int i=0;i<n;i++){
                if (text.indexOf(str[i]) > -1){
                    System.out.print(str[i] + " ");
                    check = true;
                }
        }
        if (!check){
            System.out.println("none");
        }
    }
}
