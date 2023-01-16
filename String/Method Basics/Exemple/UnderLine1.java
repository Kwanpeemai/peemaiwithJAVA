package String.Method Basics.Exemple;

import java.util.Scanner;

public class UnderLine1 {
    public static void line() {
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "";
        for (int i=0;i<n;i++){
            x = sc.next();
            System.out.println(x);
            line();
        }
    }
}
