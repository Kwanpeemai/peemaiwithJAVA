package Array2D;

import java.util.Scanner;

public class Triple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int v = sc.nextInt();

        int first = 0;
        int last = 0;
        for (int i = 1; i <= r; i++) {
            int count = 0;
            boolean ck = false;
            for (int j = 1; j <= c; j++) {
                if (arr[i][j] == v) {
                    count++;
                    if (count == 1 && ck == false) {
                        first = j;
                    }
                    if (count >= 3) {
                        last = j;
                    }
                } else {
                    if (count >= 3) {
                        ck = true;
                    }
                    count = 0;
                }
            }
            if (!ck) {
                if (count >= 3) {
                    System.out.println(first + " " + (last - 2));
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println(first + " " + (last - 2));
            }
        }
    }

}

