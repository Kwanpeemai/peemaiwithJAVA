package Class.ClassComposition;


import java.util.Scanner;

class Motor {

    double V, I, eff, HP;

    Motor(double V, double I, double eff) {
        this.V = V;
        this.I = I;
        this.eff = eff / 100;
        HP = horsepower(V, I, eff);
    }

    Motor(double I, double eff) {
        V = 220;
        this.I = I;
        this.eff = eff / 100;
        HP = horsepower(220, I, eff);
    }

    double horsepower(double V, double I, double eff) {
        return (V * I * eff / 100) / 746;
    }

    void printInfo() {
        double hp = HP;
        System.out.println(V + " " + I + " " + eff + " " + String.format("%.2f", hp));
    }
}

public class FanCompany2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double i = sc.nextDouble();
        double eff = sc.nextDouble();
        Motor motor = null;
        if (v == 220) {
            motor = new Motor(i, eff);
        } else {
            motor = new Motor(v, i, eff);
        }
        motor.printInfo();
    }
}

