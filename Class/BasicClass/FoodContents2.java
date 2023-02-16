package Class.BasicClass;

import java.util.Scanner;

class Food2 {
    String foodName;
    String content1,content2,content3;
    int w1,w2,w3;
    int cal1,cal2,cal3;
    

    Food2(String foodName, String content1, int w1, int cal1) {
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
        this.cal1 = cal1;
    }

    void addContent(String content, int w, int cal) {
        if (w2 == 0){
            content2 = content;
            w2 = w;
            cal2 = cal;
        } else if (w3 == 0){
            content3 = content;
            w3 = w;
            cal3 = cal;
        }
    }

    void printInfo(){
        System.out.println(foodName);
        int totalweight = w1+w2+w3;
        int totalCal = (w1*cal1)+(w2*cal2)+(w3*cal3);
        System.out.println(totalweight + " " + totalCal);
        System.out.print(content1 + " ");
        if (w2 > 0){
            System.out.print(content2 + " ");
        } 
        if (w3 > 0){
            System.out.print(content3 + " ");
        }
    }
}

public class FoodContents2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();
        int cal1 = scan.nextInt();
        Food2 food = new Food2(foodName, content1, w1, cal1);
        int q = scan.nextInt();
        while (q != 0) {
            if (q == 1) {
                food.printInfo();
            } else if (q == 2) {
                String content = scan.next();
                int w = scan.nextInt();
                int cal = scan.nextInt();
                food.addContent(content, w,cal);
            }
            q = scan.nextInt();
        }
    }
}
