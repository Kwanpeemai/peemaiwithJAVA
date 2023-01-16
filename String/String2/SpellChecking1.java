package String.String2;

import java.util.Scanner;


public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] text1 = new String[n];
        String[] text2 = new String[10];
        for (int i=0;i<n;i++){
            text1[i] = sc.next();    
        }
        for (int i=0;i<10;i++){
            text2[i] = sc.next();    
        }
        boolean check = false;
        for (int i=0;i<10;i++){
            for (int j=0;j<n;j++){
                boolean word = text2[i].equals(text1[j]);
            if (word == true){
                check = true;
            }
            } 
        if (!check){
            System.out.print("0");
        } else {
            System.out.print("1");
            check = false;
        }
        
    }
}
}
