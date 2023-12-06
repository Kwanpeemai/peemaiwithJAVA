package data;

import java.util.Random;

class Stack {
    private int maxStackSize = 21;
    private int stackTop = 0;
    private int[] list;
    private int stackEven = 0;
    private int stackOdd = 0;
    private int[] Even;
    private int[] Odd;

    public Stack() {
        list = new int[maxStackSize];
    }

    public Stack(int size) {
        list = new int[size];
        maxStackSize = size;
    }

    public void initialzeStack() {
        for (int i = 0; i < stackTop; i++) {
            list[i] = -1;
            stackTop = 0;
        }
    }

    public boolean isEmptyStack() {
        return (stackTop == 0);
    }

    public boolean isFullStack() {
        return (stackTop == maxStackSize);
    }

    public void push(int newItem) throws Exception {
        if (isFullStack()) {
            throw new Exception("StackOverflow");
        }
        list[stackTop] = newItem;
        stackTop++;
        if (newItem % 2 == 0) {
            Even = new int[maxStackSize];
            Even[stackTop] = newItem;
            stackEven++;
        } else {
            Odd = new int[maxStackSize];
            Odd[stackTop] = newItem;
            stackOdd++;
        }
    }

    public int getEvenSize() {
        return stackEven;
    }

    public int getOddSize() {
        return stackOdd;
    }

    public int popEven() {
        int itemInfo;
        itemInfo = list[stackTop];
        if (itemInfo % 2 == 0) {
            itemInfo = Even[stackTop];
            stackTop--;
        }

        return itemInfo;
    }

    public int popOdd() {
        int itemInfo;
        itemInfo = list[stackTop];
        if (itemInfo % 2 != 0) {
            itemInfo = Odd[stackTop];
            stackTop--;
        }
        return itemInfo;
    }

}

public class Lab5 {

    public static void main(String[] args) {
        try {
            Stack s = new Stack(21);
            Random rand = new Random();
            int n = rand.nextInt(11) + 10;
            System.out.println("--- Random Numbers [" + n + "] ---");
            for (int i = 0; i < n; i++) {
                int r = rand.nextInt(101);
                System.out.print(r + " ");
                s.push(r);
            }

            System.out.println();
            System.out.println("--- Even Stack [" + s.getEvenSize() + "] ---");
            for (int i = 1; i < s.getEvenSize(); i++) {
                System.out.print(s.popEven() + " ");
            }

            System.out.println();
            System.out.println("--- Odd Stack [" + s.getOddSize() + "] ---");
            for (int i = 1; i < s.getOddSize(); i++) {
                System.out.print(s.popOdd() + " ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
