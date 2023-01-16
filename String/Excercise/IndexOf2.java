package String.Excercise;

import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.next();
        int in = -2;
        boolean check = false;
        for (int i=0;i<text1.length();i++){
            int index = text1.indexOf(text2, i);
            if (index != in && index != -1){
                System.out.print(index+1 + " ");
                in = index;
                check = true;
            }
        }
            if (!check)
            {
                System.out.println("string not found");
            }
        }
}
