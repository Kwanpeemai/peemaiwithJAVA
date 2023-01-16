package String.String2;

import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        int a = 0;
        boolean check = false;
        for (int i=0;i<text.length()-2;i++){
            if (text.charAt(i)+1 == text.charAt(i+1) && text.charAt(i+1)+1 == text.charAt(i+2)){
                count++;
                if(check == false){
                    check = true;
                    a = i;   
                }
                
            }
        }
        System.out.println(count);
        if (count == 0){
            System.out.println("-1");
        } else {
            System.out.println(a+1);
        }  
    }
}
