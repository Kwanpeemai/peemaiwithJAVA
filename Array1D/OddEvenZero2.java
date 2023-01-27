package Array1D;

import java.util.Scanner;

public class OddEvenZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int odd = 0;
        int even = 0;
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if (a[i]%2!=0 && a[i]>odd){
                System.out.print(a[i] + " ");
                odd = a[i];
            }else if (a[i]==0){
                System.out.print(a[i] + " ");
                odd = a[i];
            }
        }
        System.out.println();
        for (int i=0;i<n;i++){
            if (a[i]%2==0 && a[i]>even){
                System.out.print(a[i] + " ");
                even = a[i];
            }else if (a[i]==0){
                System.out.print(a[i] + " ");
                even = a[i];
            }
        }
        
        
        }
    }
    

