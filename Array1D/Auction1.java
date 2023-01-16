package Array1D;

import java.util.Scanner;
  
public class Auction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
        int k = sc.nextInt();
            for (int i=0;i<k;i++){
                for (int j=0;j<n;j++){
                    int x = sc.nextInt();
                    if (x>a[j]){
                        a[j] = x;
                    }
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
            }
            
        
    }
}

