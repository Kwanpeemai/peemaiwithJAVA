package Class.BasicClass;

import java.util.Scanner;

class Food {
    String foodName;
    String content;
    int w1;
    int sum;
    

    Food(String foodName, String content1, int w1) {
        this.foodName = foodName;
        content = content1;
        this.w1 = w1;
        sum = 0;
        sum += w1;
    }

    void addContent(String content1, int w1) {
        content += " " + content1;
        sum += w1;
    }

    void printInfo(){
        System.out.println(foodName);
        System.out.println(sum);
        System.out.println(content);
    }
}

public class FoodContent1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        Food food = new Food(foodName, content1, w1);
        int q = scan.nextInt();
        while (q != 0) {
            if (q == 1) {
                food.printInfo();
            } else if (q == 2) {
                content1 = scan.next();
                w1 = scan.nextInt();
                food.addContent(content1, w1);
            }
            q = scan.nextInt();
        }
    }
}
