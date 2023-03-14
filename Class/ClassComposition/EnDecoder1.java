package Class.ClassComposition;

import java.util.Scanner;

class Encoder {
    String[] vocab;
    int[] id;

    Encoder ( String[] vocab, int[] id){
        this.vocab = vocab;
        this.id = id;
    }
    private int encodeWord (String word){
        for (int i=0;i<vocab.length;i++){
            if (vocab[i].equals(word)){
                return id[i];
            }
        }
        return -1;
    }
    
    int[] encodeMsg (String[] word){
        int[] arr = new int[word.length];
        for (int i=0;i<word.length;i++){
            arr[i] = encodeWord(word[i]);
        }
        return arr;
    }

}

public class EnDecoder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] vocab = new String[n];
        int[] id = new int[n];
        for (int i=0;i<n;i++){
            vocab[i] = sc.next();
        }
        for (int i=0;i<n;i++){
            id[i] = sc.nextInt();
        }
        Encoder en = new Encoder(vocab, id);
        int k = sc.nextInt();
        String[] word = new String[k];
        for (int i=0;i<k;i++){
            word[i] = sc.next();
        }
        int[] A = en.encodeMsg(word);
        for (int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}
