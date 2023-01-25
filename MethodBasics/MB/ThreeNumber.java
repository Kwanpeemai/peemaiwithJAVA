package MethodBasics.MB;

import java.util.Scanner;

public class ThreeNumber {
    void Num(int find, int min, int max, int median) {
        if (find == -1) {
            System.out.println(min);
        }
        if (find == 0) {
            System.out.println(median);
        }
        if (find == 1) {
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] != min && arr[i] != max) {
                median = arr[i];
            }
        }
        int find = sc.nextInt();
        ThreeNumber num = new ThreeNumber();
        num.Num(find, min, max, median);
    }
}
