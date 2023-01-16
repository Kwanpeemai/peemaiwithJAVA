package Array1D;

import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int p,j;
        for (int i = 0; i < q; i++) {
            int pos = sc.nextInt();
            int k = sc.nextInt();

            for (j=pos-2;j<=pos+2;j++) {
                if (j>0 && j<=n){
                    if (arr[j]>0){
                        if (arr[j]<k){
                            arr[j]=0;
                        } else {
                            arr[j]-=k;
                        }
                    }
                }
            }
            for (int y=1;y<=n;y++){
                System.out.print(arr[y] + " ");
            }
            System.out.println("");
               
        }
    }
}

