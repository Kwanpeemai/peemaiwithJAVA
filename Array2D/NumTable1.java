package Array2D;

import java.util.Scanner;

public class NumTable1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[][] a = new int[n+1][2+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //answer
         for (int i=1;i<=n;i++){
                if ((a[i][1]>=1 && a[i][1]<=r) && ( a[i][2]>=1 && a[i][2]<=c)){
                    System.out.print(arr[a[i][1]][a[i][2]]);
                } else {
                    System.out.print("-");  
                }
            }
        }
}
