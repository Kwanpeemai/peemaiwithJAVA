package Array1D;
    
import java.util.Scanner;

public class NumMixer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int j=0;j<n;j++){
            b[j] = sc.nextInt();
        }
        int k = sc.nextInt();
      
        if (k>0){
            for (int i=0;i<n;i++){
                System.out.print(a[i] +" " +  b[n-1-i] + " ");
            }
        } else {
             for (int i=0;i<n;i++){
                System.out.print(b[n-1-i] +" " +  a[i] + " ");
            }
        }
    }
        
}

