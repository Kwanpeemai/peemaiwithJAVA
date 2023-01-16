package Array1D;

import java.util.Scanner;

public class SlotReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int k = sc.nextInt();
        int p = sc.nextInt();
        for (int i=0;i<p;i++){
           int x = sc.nextInt();
           if (a[x]<k){
               a[x]++;
               System.out.println("1");
           } else {
               b[x]++;
               System.out.println("2");
           }
        }
        for (int i=1;i<=n;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
        for (int i=1;i<=n;i++){
            
            System.out.print(b[i]+" ");
        }
        
    }
 
}
