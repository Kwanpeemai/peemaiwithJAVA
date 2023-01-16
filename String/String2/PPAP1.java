package String.String2;

import java.util.Scanner;

public class PPAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pp = "PPAP";
        String god = "GOD";
        if (str.indexOf(pp) == -1){
            System.out.println("clean");
        } else if (str.indexOf(god)<str.indexOf(pp) && str.lastIndexOf(pp)<str.lastIndexOf(god)){
            System.out.println("safe");
        } else {
            System.out.println("danger");
        }
       
        
                
    }
}
