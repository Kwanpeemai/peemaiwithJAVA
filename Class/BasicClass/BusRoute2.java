package Class.BasicClass;

import java.util.Scanner;

class Route2 {
    private int N;
    private String[] names;
    private int[] distances;
    private int count;

    Route2(int N, String[] names, int[] distances) {
        this.N = N;
        this.names = names;
        this.distances = distances;
        count = 0;
    }

    void summarizeRoute() {
        for (int i = 1; i <= N; i++) {
            count += distances[i];
            if (i == 1) {
                System.out.print(names[i] + " ");
            }
            if (i == N) {
                System.out.print(names[N] + " ");
            }
        }
        System.out.print(count);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N + 1];
        int[] distances = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route2 route = new Route2(N, names, distances);
        route.summarizeRoute();
    }
}
