package Array1D;

import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+1];
            for (int i=1;i<n+1;i++){
                A[i] = sc.nextInt();
            }
        int k = sc.nextInt();
        int[] B = new int[n+1];
        for (int i=0;i<k;i++){
            int a = sc.nextInt();
            int q = sc.nextInt();
            int b = sc.nextInt();
            
            if (a==1){
                if ((A[b] - B[b]) >= q){
                    B[b]+=q;
                    System.out.println(B[b]);
                }else{
                    System.out.println("-1");
                }
            }else{
                if (B[b] >= q){
                    B[b]-=q;
                    System.out.println(B[b]);
                } else if (B[b]<q){
                    System.out.println("-1");
                
            }
            }
        }
        
        
    }
   
}


