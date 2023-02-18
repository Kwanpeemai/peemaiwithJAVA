package Class.ClassComposition;

import java.util.Scanner;

class Blade {

    int size;
    int number;
    int angle;
    double hp;
    boolean valid;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
        if (!((size >= 16) && (size <= 24) && (size % 2 == 0))) {
            valid = false;
            System.out.println("invalid size");
        }
        if ((number < 3) || (number > 5)) {
            valid = false;
            System.out.println("invalid number of blades");
        }
        if (!(angle == 27 || angle == 30 || angle == 33)) {
            valid = false;
            System.out.println("invalid angle");
        }
        if (hp <= 0) {
            valid = false;
            System.out.println("invalid horsepower");
        }
    }

    void printInfo() {
        System.out.println(size + " " + number + " " + angle + " " + hp + " " + valid);
    }
}

public class FanCompany1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numb = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
    }
}
