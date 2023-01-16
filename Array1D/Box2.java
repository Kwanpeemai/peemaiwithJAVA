package Array1D;

import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            A[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int[] B = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int q = sc.nextInt();
            if (a == 1) {
                int b = sc.nextInt();
                if ((A[b] - B[b]) >= q) {
                    B[b] += q;
                    System.out.println(B[b]);
                } else {
                    System.out.println("-1");
                }
            } else if (a == 2) {
                boolean ch = false;
                for (int j = 1; j <= n; j++) {
                    if (q == 0) {
                        break;
                    }
                    if (B[j] - q >= 0) {
                        B[j] -= q;
                        q = 0;
                        ch = true;
                        System.out.println(j + " " + B[j]);
                    } else {
                        q -= B[j];
                        B[j] = 0;
                    }
                }
                if (ch == false) {
                    System.out.println(n + " " + 0);
                }

            }
        }

    }

}


