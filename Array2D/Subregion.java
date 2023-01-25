package Array2D;

import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r + 1][c + 1];
        int p = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        if (p > 0 && q > 0 && p + h - 1 <= r && q + w - 1 <= c) {
            for (int i = p; i < h + p; i++) {
                for (int j = q; j < w + q; j++) {
                    arr[i][j] = 1;
                }
            }
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("invalid input");
        }

    }
}
