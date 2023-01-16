package Array1D;

import java.util.Scanner;

public class CP_SU48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int p = sc.nextInt();
        int[] morn = new int[n+1];
        int[] noon = new int[n+1];
        for (int i=1;i<=p;i++){
            int r = sc.nextInt();
            int s = sc.nextInt();

            if (s == 1){
                if (morn[r] != k1){
                    morn[r]++;
                    System.out.println("1");
                } else {
                    if (noon[r] != k2){
                        noon[r]++;
                    System.out.println("2");
                    } else {
                        System.out.println("0");
                    }
                }
            }else if (s == 2){
                if (noon[r] != k2){
                    noon[r]++;
                    System.out.println("2");
                } else {
                    if (morn[r] != k1){
                        morn[r]++;
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                }
            }   
        }
        for (int i=1;i<=n;i++){
            System.out.print(morn[i] + " ");
        } 
        System.out.println();
        for (int i=1;i<=n;i++){
            System.out.print(noon[i] + " ");
        }
    }
}

