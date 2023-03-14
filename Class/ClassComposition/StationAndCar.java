package Class.ClassComposition;

import java.util.Scanner;

class Station {
    int benzin;
    int diesel;

    Station(int benzin, int diesel) {
        this.benzin = benzin;
        this.diesel = diesel;
    }

    void dispense(Car car) {
        if (car.gasType == 1) {
            if (benzin == 0) {
                System.out.println("Dispense 0 liters of benzin");
            } else if (benzin < car.getNeededVol()) {
                System.out.println("Dispense " + benzin + " liters of benzin");
                benzin = 0;
            } else {
                System.out.println("Dispense " + car.getNeededVol() + " liters of benzin");
                benzin -= car.getNeededVol();
            }
        } else {
            if (diesel == 0) {
                System.out.println("Dispense 0 liters of diesel");
            } else if (diesel < car.getNeededVol()) {
                System.out.println("Dispense " + diesel + " liters of diesel");
                diesel = 0;
            } else {
                System.out.println("Dispense " + car.getNeededVol() + " liters of diesel");
                diesel -= car.getNeededVol();
            }
        }
    }

    void refillBenzin(int C) {
        benzin += C;
        System.out.println("Station has " + benzin + " liters of benzin");
    }

    void refillDiesel(int C) {
        diesel += C;
        System.out.println("Station has " + diesel + " liters of diesel");
    }
}

class Car {
    int gasType;
    int C;
    int D;

    Car(int B, int C, int D) {
        gasType = B;
        this.C = C;
        this.D = D;
    }

    int getNeededVol() {
        return C - D;
    }
}

public class StationAndCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station s = new Station(benzin, diesel);

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            Car c = new Car(B, C, D);

            if (A == 1){
                s.dispense(c);
            } 
            if (A == 2){
                if (B == 1) s.refillBenzin(C);
                else if (B == 2) s.refillDiesel(C);
            }
        }
    }
}
