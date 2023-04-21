package quiz1.summer;

import java.util.Scanner;

public class Supiercer0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = 0;
        int second = 0;
        int third = 0;
        int tail = 0;
        int fake = 0;
        int classfake = 0;
        for (int i=0;i<N;i++){
            int ticket = sc.nextInt();
            if ((ticket/100)%10==0){
                System.out.println("Wilkorn Only");
            } else if ((ticket/100)%10==1){
                first++;
            } else if ((ticket/100)%10==2){
                second++;
            } else if ((ticket/100)%10==3){
                third++;
            } else if ((ticket/100)%10==4){
                tail++;
            } else {
                classfake = (ticket/100)%10;
                System.out.println("No Permission");
                fake++;
            }
        }
        System.out.println("First Class " + first);
        System.out.println("Second Class " + second);
        System.out.println("Third Class " + third);
        System.out.println("The Tail " + tail);
        System.out.println("###########");
        System.out.println("Fake Tickets");
        System.out.println("Class " + classfake + " " + fake);
    }
}
