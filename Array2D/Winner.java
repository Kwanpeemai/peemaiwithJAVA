package Array2D;

import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int n = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    n++;
                }
            }
        }
        int k = sc.nextInt();
        int round_miss = 0;
        int round_hit = 0;
        int count = 0;
        int count_ship = 0;
        int count_f = 0;
        int count_ship_miss = 0;
        int count_all = 0;
        int count_out = 0;
        for (int i = 1; i <= k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > 0 && b > 0 && a <= r && b <= c) {
                if (arr[a - 1][b - 1] == 1) {
                    count_ship++;
                    count++;
                    arr[a - 1][b - 1] = -1;
                    round_hit = i;
                    if (count == 1){
                        round_miss = i;
                    }
                } else if (arr[a - 1][b - 1] == 0) {
                    count_f++;
                    arr[a - 1][b - 1] = -2;
                } else if (arr[a - 1][b - 1] == -1) {
                    count_ship_miss++;
                } else if (arr[a - 1][b - 1] == -2) {
                    count_all++;
                }
            } else {
                count_out++;
            }
        }
        System.out.println(count_ship);
        System.out.println(count_f);
        System.out.println(count_ship_miss);
        System.out.println(count_all);
        System.out.println(count_out);

        if (n == count) {
            System.out.println("attacker" + " " + round_hit);
        } else {
            if(count > 0){
                System.out.println("battleship" + " " + round_miss);
            } else {
                System.out.println("battleship -1");
            }
            
        }
    }
}
