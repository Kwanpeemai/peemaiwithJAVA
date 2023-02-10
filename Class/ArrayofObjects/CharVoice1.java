package Class.ArrayofObjects;

import java.util.Scanner;

class Character {
    private String[] msg;
    private int N;
    private int count = 0;

    Character(String[] msg){
        N = msg.length;
        this.msg = new String[N];
        for (int i=0;i<N;i++){
            this.msg[i] = msg[i];
        }
    }

    public void speak(){
        System.out.println(msg[count]);
        count = (count+1) % N;
    }
}


public class CharVoice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] msg = new String[N];
        sc.nextLine();
        for (int i=0;i<N;i++){
            msg[i] = sc.nextLine();
        }

        Character c = new Character(msg);
        final int K = sc.nextInt(); 
        for(int i = 0; i < K; ++i) {
            c.speak(); 
        }
    }
}
