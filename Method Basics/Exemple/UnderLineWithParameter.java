package String.Method Basics.Exemple;

import java.util.Scanner;

public class UnderLineWithParameter {
    public static void line(int k,Scanner sc) {
        for (int i=0;i<k;i++){
          System.out.print("-"); 
        }
            System.out.println("");
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "";
        for (int i=0;i<n;i++){
            x = sc.next();
            int k = sc.nextInt();
            System.out.println(x);
            line(k,sc);
        }
    }
 
}
