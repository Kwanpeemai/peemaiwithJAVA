package quiz1.summer;

import java.util.Scanner;

public class Togeinumak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = sc.next();
        if (str.contentEquals("Konbu")) System.out.println(str + "Hi");
        if (text.contentEquals("OKaKa")) System.out.println(str + "No");
        if (text.contentEquals("Shake")) System.out.println(str + "Yes");
        if (text.contentEquals("Takana")) System.out.println(str + "Are you okey ?");
        if (text.contentEquals("Tuna")) System.out.println(str + "Focus");
        if (text.contentEquals("Tunamayo")) System.out.println(str + "Serious matter");
        if (text.contentEquals("Suiiko")) System.out.println(str + "Mmm");
        if (text.contentEquals("Mentaiko")) System.out.println(str + "Combat");
    }
}
