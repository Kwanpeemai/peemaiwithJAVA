package Array2D;

import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int count = 0;
        int w = -1;
        for (int i = 1; i <= n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r >=1 && r <= R && c >=1 && c <= C) {
                if (w == arr[r][c]) {
                    System.out.print("*");
                } else {
                    System.out.print(arr[r][c]);
                }
                w = arr[r][c];
                count = 0;
            } else {
                count++;
                if (count < 2 && i>1) {
                    System.out.println("");
                    w = -1;
                }
            }
        }

    }
}

