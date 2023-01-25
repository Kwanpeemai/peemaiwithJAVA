package MethodBasics.MB;

import java.util.Scanner;

public class AgeReport { 
    private static int count = 0;
    static void reportAge(int N, int[] IDs,int[] ages,int y1, int y2) {
        for (int i=0;i<N;i++){
            if (ages[i]>=y1 && ages[i]<=y2){
                System.out.println(IDs[i]);
                count++;
            }
        }
        System.out.println("There are " + count + " persons in age range of " + y1 + " to " + y2);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] IDs = new int[N];
        int[] ages = new int[N];
        for (int i=0;i<N;i++){
            IDs[i] = scan.nextInt();
            ages[i] = scan.nextInt();
        }
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        AgeReport AR = new AgeReport();
        AR.reportAge(N, IDs, ages, y1, y2);

} 
}