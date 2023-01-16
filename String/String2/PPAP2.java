package String.String2;

import java.util.Scanner;


public class PPAP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
         String pp = "PPAP";
        String god = "GOD";
        int index = 0;
        for (int i=0;i<str.length();i++){
            int p1 = str.indexOf(pp, index);
            int p2 = str.indexOf(pp, p1+1);
            int g = str.indexOf(god, index);
            if (g<p2){
                index = p2;
            } else {
                System.out.println(p2+4);
                break;
            }
        }
    }
}
