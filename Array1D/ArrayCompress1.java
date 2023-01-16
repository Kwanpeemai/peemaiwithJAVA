package Array1D;

import java.util.Scanner;

public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != k) {
                sum = sum + a[i];
            } else {
                System.out.print(sum + " ");
                System.out.print(k + " ");
                sum = 0;
            }
                
        }
        System.out.print(sum);
    }
}


