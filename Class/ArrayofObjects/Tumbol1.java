package Class.ArrayofObjects;
    
import java.util.Scanner;

class Tambol {

    public String name;
    public int id1;
    public int id2;
    public int people;
    public int N;
    public int availBudget;

    Tambol(String name, int id1, int id2, int people) {
        this.name = name;
        this.id1 = id1;
        this.id2 = id2;
        this.people = people;
        availBudget = people * 5000;
    }

    void allocateBudget(int[] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (availBudget - arr[i] > 0) {
                System.out.print(i+1 + " ");
                availBudget = availBudget - arr[i];
                check = true;
            }
        }
        if(!check){
            System.out.println("none");
        }
    }
}

public class Tumbol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();
        int people = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        Tambol TB = new Tambol(name, id1, id2, people);
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        TB.allocateBudget(arr);

    }
}


