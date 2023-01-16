package Array1D;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
        int x = sc.nextInt();
        int count = 0;
        for (int i=0;i<n;i++){
        if (x == a[i]){
            System.out.print((i+1) + " ");
            count++;
        }
        }
        if (count == 0){
            System.out.print("0");
        }
    }
    
}
