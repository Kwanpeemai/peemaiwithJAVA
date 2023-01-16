package Array1D;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[k];
        for (int i=0;i<k;i++){
            x[i] = sc.nextInt();
        }
        int max = 0; 
        int maxcount = 0;
        int maxnum = 0;
        for (int i=1;i<=n;i++){
            for (int j=0;j<k;j++){
                if (i==x[j]){
                max++;
                }
            }
            if (max > maxcount){
                maxcount = max;
                maxnum = i;
            }
            max = 0;
        }
        System.out.println(maxnum);
        System.out.println(maxcount);
    }
}

