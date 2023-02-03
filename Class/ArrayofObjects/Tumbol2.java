package Class.ArrayofObjects;
    
import java.util.Scanner;

class Tambol1 {

    public String name;
    public int id1;
    public int id2;
    public int people;
    public int availBudget;

    Tambol1(String name, int id1, int id2, int people) {
        this.name = name;
        this.id1 = id1;
        this.id2 = id2;
        this.people = people;
        availBudget = people * 5000;
    }

    int allocateBudget(int[] arr) {
        boolean check = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (availBudget - arr[i] > 0) {
                System.out.print(i + 1 + " ");
                availBudget = availBudget - arr[i];
                check = true;
                sum += arr[i];
            }
        }
        if (!check) {
            System.out.print("none");
        }
        System.out.println("");
        return sum;
    }
}

public class Tumbol2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Tambol1[] tumbols = new Tambol1[k];
        for (int i = 0; i < k; i++) {
            String name = sc.next();
            int id1 = sc.nextInt();
            int id2 = sc.nextInt();
            int people = sc.nextInt();
            tumbols[i] = new Tambol1(name, id1, id2, people);
        }
        int total = 0;
        for (int i = 0; i < k; ++i) {
            int N = sc.nextInt();
            int[] budget = new int[N];
            for (int j = 0; j < N; j++) {
                budget[j] = sc.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}
