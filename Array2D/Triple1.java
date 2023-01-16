package Array2D;

import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int v = sc.nextInt();
        
        
         for (int i=0;i<r;i++){
            int count = 0;
            for (int j=0;j<c;j++){
                if (arr[i][j]==v){
                    count++;
                    if (count==3){
                     System.out.print(i+1 + " ");
                     break;
                    }
                } else {
                    count=0;
                }
            }
        }
  
    }
}

