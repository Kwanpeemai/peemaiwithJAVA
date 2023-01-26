package Class.BasicClass;

import java.util.Scanner;
class Route {
  private int N;
  private String[] names;
  private int[] distances;

    Route (int N,String[] names,int[] distances){
        this.N =N;
        this.names = names;
        this.distances = distances;
    }

    void getStopInfo(int b,int N){
        if (b>N || b<=0){
            System.out.println("invalid number");
        } else {
            System.out.println(names[b] + " " + distances[b]);
        }    
        }
        
    }
public class BusRoute1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    String[] names = new String[N+1];
    int[] distances = new int[N+1];
    for(int i=1;i<=N;i++) {
      names[i] = scan.next();
      distances[i] = scan.nextInt();
    }
    Route route = new Route(N, names, distances); 
    final int K = scan.nextInt();
    for(int i = 0; i < K; ++i) {
      int b = scan.nextInt();
      route.getStopInfo(b, N);
    }
} }
