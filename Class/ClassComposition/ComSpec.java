package Class.ClassComposition;

import java.util.Scanner;

class CPU {
    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;

    boolean isValidSpec(String model, int clocks, int socket, int memType){
        if (model != null && model.length() > 0 && clocks > 0 && socket > 0 && memType > 0 && memType <= 10){
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    CPU (String model, int clocks, int socket, int memType){
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        valid = isValidSpec(model, clocks, socket, memType);
    }
    void printInfo (){
        System.out.println(model);
        System.out.println(clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

public class ComSpec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        cpu.printInfo();
    }
}
