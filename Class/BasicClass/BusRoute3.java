package Class.BasicClass;

import java.util.Scanner;

class Route3 {
    private int N;
    private String[] names;
    private int[] distances;
    private int count;

    Route3(int N, String[] names, int[] distances) {
        this.N = N;
        this.names = names;
        this.distances = distances;
        count = 0;
    }
    void getTripInfo(int a, int b){
        if(a <= 0 || b <= 0 || a > distances.length -1
        || b > distances.length - 1|| a >= b
        ){
            System.out.println("invalid number");
        } else {
            for(int i = a+1; i<=b; i++){
                count += distances[i];
            }
            
            System.out.println(names[a] + " " + names[b] + " " + count);
        }
        count = 0;
    }
}

public class BusRoute3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route3 route = new Route3(N, names, distances);
        final int K = scan.nextInt();
        for (int i = 1; i <= K; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            route.getTripInfo(a, b);
        }
        
    }
}
