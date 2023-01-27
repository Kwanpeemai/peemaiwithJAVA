package Array2D;

import java.util.Scanner;

public class FillGasTank {
    public int[][] arr;
    public int sum;

    FillGasTank(int[][] arr){
        this.arr = arr;
        sum = 0;
    }

    void fuelCost(String size,int p1, int p2){
        if ("L".equals(size)){
            sum = ((arr[p1][p2] * 350)/60);
            System.out.println(sum);
        }
        if ("M".equals(size)){
            sum = ((arr[p1][p2] * 270)/60);
            System.out.println(sum);
        }
        if ("S".equals(size)){
            sum = ((arr[p1][p2] * 200)/60);
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        FillGasTank tank = new FillGasTank(arr);
        int p = sc.nextInt();
        for (int i=0;i<p;i++){
                String size = sc.next();
                int p1 = sc.nextInt();
                int p2 = sc.nextInt();
                tank.fuelCost(size, p1, p2);
                
        }
    }
}
