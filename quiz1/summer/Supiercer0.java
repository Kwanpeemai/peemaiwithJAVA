package quiz1.summer;

import java.util.Scanner;

public class Supiercer0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ticket = new int[10];
        boolean fake = false;
        for (int i = 0; i < N; i++) {
            int id = sc.nextInt() % 1000 / 100;
            if (id == 0) {
                System.out.println("Wikorn Only");
            }
            if (id > 4) {
                System.out.println("No Permission");
                fake = true;
            }
            ticket[id]++;
        }
        System.out.println("First Class " + ticket[1]);
        System.out.println("Second Class " + ticket[2]);
        System.out.println("Third Class " + ticket[3]);
        System.out.println("The Tail " + ticket[4]);
        if (fake) {
            System.out.println("###########");
            System.out.println("Fake Tickets");
            for (int i = 5; i < 10; i++) {
                if (ticket[i] != 0) {
                    System.out.println("Class " + i + " " + ticket[i]);

                }

            }
        }

    }
}
