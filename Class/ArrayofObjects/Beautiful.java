package Class.ArrayofObjects;

import java.util.Scanner;

class Audience {
    private String[] msg;
    private int N;
    private int currentIndex = 0; 
    Audience (String[] msg){

    }
}

public class Beautiful {
    public static void main(String[] args) {
        // Read all the inputs
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String[] phrases = new String[K];
        scan.nextLine();
        for (int i = 0; i < K; ++i) {
            phrases[i] = scan.nextLine();
        }
        final int C = scan.nextInt();
        Audience[] Cs = new Audience[C + 1];
        for (int p = 1; p <= C; ++p) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for (int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            Cs[p] = new Audience(msg);
        }
        // Enter your code here
    }
}
