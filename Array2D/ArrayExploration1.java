package Array2D;

import java.util.Scanner;

public class ArrayExploration1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int [r+1][c+1];
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int k = sc.nextInt();
        for (int i=1;i<=k;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A>=1 && A<=r && B>=1 && B<=c){
                if (arr[A][B]>0){
                    count1++;
                }
                if (arr[A][B]<0){
                    count2++;
                }
                if (arr[A][B]%2==0){
                    count3++;
                }
                if (arr[A][B]%2!=0){
                    count4++;
                }
            }
        }
        System.out.print(count1 + " " + count2 + " " + count3 + " " + count4);
        }
    }

