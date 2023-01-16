package Array1D;

import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print((y+a[i])-1+" ");
        }
    }
}

