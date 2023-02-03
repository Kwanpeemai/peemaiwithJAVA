package FromCtoJAVA;

import java.util.Scanner;

public class W1P3_NoDivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if (z == 0){
            System.out.println("cannot divide by zero");
        } else {
            Double result = (x+y)/z;
            System.out.println(String.format("%.6f", result));
        }
    }
}
