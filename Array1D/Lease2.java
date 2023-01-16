package Array1D;

import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
        int y = sc.nextInt();
        int numY = sc.nextInt();
        int[] b = new int[numY];
            for (int i=0;i<numY;i++){
                b[i] = sc.nextInt();
            }
        int count = 0;
        for (int i=0;i<numY;i++){
            for (int j=0;j<n;j++){
                if (b[i] >= y + a[j]){
                    System.out.print((j+1)+" ");
                    count++;
                }
            }
            if (count == 0){
                System.out.print("full");
            }
            count = 0;
            System.out.println();
        }

    }
    
}

