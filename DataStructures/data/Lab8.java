import java.util.ArrayList;
import java.util.Random;

class SArr{
    private int[] arr;

    public SArr(int n){
        arr = new int[n];
    }

    public void randVal(int m){
        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            int num = rand.nextInt(m*(-1),m+1);
            arr[i] = num;
        }
    }



    public  void insertSort(){
        int key, j;
        for(int i = 1; i<arr.length; i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void selectionSort(){
        int min, j;
        for(int i = 0; i < arr.length; i++){
            min = i;
            for(j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void bubbleSort(){
        boolean ch;
        int i, j;
        for(i = 0; i < arr.length-1; i++){
            ch = false;
            for(j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ch = true;
                }
            }
            if(ch = false){
                break;
            }
        }
    }

    public void shellSort(){
        int i, j, temp;
        for(i = arr.length/2; i>0; i/=2){
            for(j = i; j<arr.length; j++){
                temp = arr[j];
                int k;
                for(k = j; k>=i && arr[k-i] > temp; k-=i){
                    arr[k] = arr[k - i];
                }
                arr[k] = temp;
            }
        }
    }

    public void printVal(){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Random rand = new Random();

        //Insertion Sort 
        int n = rand.nextInt(10,21);
        int m = rand.nextInt(10,51);
        SArr sarr = new SArr(n);
        sarr.randVal(m);
        System.out.println("Random "+n+" numbers ["+(m*-1)+".."+m+"] :");
        sarr.printVal();
        System.out.println("Insertion Sort :");
        sarr.insertSort();
        sarr.printVal();
        System.out.println("----------------------------");

        //Selection Sort
        n = rand.nextInt(10, 21);
        m = rand.nextInt(10, 51);
        sarr = new SArr(n);
        sarr.randVal(m);
        System.out.println("Random "+n+" numbers ["+(m*-1)+".."+m+"] :");
        sarr.printVal();
        System.out.println("Selection Sort :");
        sarr.selectionSort();
        sarr.printVal();
        System.out.println("----------------------------");

        //Bubble Sort
        n = rand.nextInt(10, 21);
        m = rand.nextInt(10, 51);
        sarr = new SArr(n);
        sarr.randVal(m);
        System.out.println("Random "+n+" numbers ["+(m*-1)+".."+m+"] :");
        sarr.printVal();
        System.out.println("Bubble Sort :");
        sarr.bubbleSort();
        sarr.printVal();
        System.out.println("----------------------------");

        //Shell Sort
        n = rand.nextInt(10, 21);
        m = rand.nextInt(10, 51);
        sarr = new SArr(n);
        sarr.randVal(m);
        System.out.println("Random "+n+" numbers ["+(m*-1)+".."+m+"] :");
        sarr.printVal();
        System.out.println("Shell Sort :");
        sarr.shellSort();
        sarr.printVal();
        System.out.println("----------------------------");
    }
}
