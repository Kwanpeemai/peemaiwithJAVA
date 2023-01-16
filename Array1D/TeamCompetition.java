package Array1D;

import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    for (int i=0;i<n;i++){
        A[i] = sc.nextInt();
    }
    for (int i=0;i<n;i++){
        B[i] = sc.nextInt();
    }
    int score1 = 0, score2 = 0;
    for (int i=0;i<n;i++){
        if (A[i]>B[i]){
            score1+=2; 
        } else if (A[i]<B[i]){
            score2+=2;
        } else {
            score1++;
            score2++;
        }
    }
    if (score1>score2){
        System.out.println("Team 1 wins");
        System.out.println("Score " +score1+ " to " +score2);
    }else  if (score2>score1){
        System.out.println("Team 2 wins");
        System.out.println("Score " +score2+ " to " +score1);
    } else {
         System.out.println("Draw game");
        System.out.println("Score " + score1 + " to " + score2);
    }
            
    }
}
