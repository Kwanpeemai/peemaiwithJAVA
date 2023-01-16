package String.Excercise;

import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i=0;;i++){
            String text = sc.nextLine();
            if (text.length() == 0){
                break;
            }
            if (text.length()==max){
                count++;
            } else if (text.length()>max){
                count = 0;
                max = text.length();
            }
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}
