package data;

import java.util.Random;

class NodeOdd {
    private int info;
    private NodeOdd link = null;

    public NodeOdd(int info, NodeOdd link) {
        this.info = info;
        this.link = link;
    }

    public NodeOdd(int info) {
        this(info, null);
    }

    public NodeOdd() {
        this(0, null);
    }

    public int getInfo() {
        return info;
    }

    public NodeOdd getLink() {
        return link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setLink(NodeOdd link) {
        this.link = link;
    }

    public String toString() {
        return "" + info;
    }
}

class NodeEven {
    private int info;
    private NodeEven link;

    public NodeEven(int info, NodeEven link) {
        this.info = info;
        this.link = link;
    }

    public NodeEven(int info) {
        this(info, null);
    }

    public NodeEven() {
        this(0, null);
    }

    public int getInfo() {
        return info;
    }

    public NodeEven getLink() {
        return link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setLink(NodeEven link) {
        this.link = link;
    }

    public String toString() {
        return "" + info;
    }
}

class Queue {
    private NodeEven frontE = null;
    private NodeOdd frontO = null;
    private NodeEven BackE = null;
    private NodeOdd BackO = null;
    private int StackEven = 0;
    private int StackOdd = 0;

    public void addEven(int newInfo) {
        NodeEven newNode = new NodeEven(newInfo);
        if (frontE == null) {
            frontE = newNode;
            BackE = newNode;
        } else {
            BackE.setLink(newNode);
            BackE = BackE.getLink();
        }
        StackEven++;
    }

    public void addOdd(int newInfo) {
        NodeOdd newNode = new NodeOdd(newInfo);
        if (frontO == null) {
            frontO = newNode;
            BackO = newNode;
        } else {
            BackO.setLink(newNode);
            BackO = BackO.getLink();
        }
        StackOdd++;
    }

    public int getEvenSize() {
        return StackEven;
    }

    public int getOddSize() {
        return StackOdd;
    }

    public String toStringEven() {
        NodeEven trav = frontE;
        String str = "[ ";
        while (trav != null) {
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str + "]";
    }

    public String toStringOdd() {
        NodeOdd trav = frontO;
        String str = "[ ";
        while (trav != null) {
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str + "]";
    }

    public void winner() {
        NodeEven Even = frontE;
        NodeOdd Odd = frontO;
        int countE = 0;
        int countO = 0;
        while (Even.getLink() != null && Odd.getLink() != null) {
            if (Even.getInfo() > Odd.getInfo()) {
                countE++;
            } else {
                countO++;
            }

            Even = Even.getLink();
            Odd = Odd.getLink();
        }
        if (Even.getInfo() > Odd.getInfo()) {
            countE++;
        } else
            countO++;

        if (countE > countO) {
            System.out.println("===> Even is the winner");
        } else
            System.out.println("===> Odd is the winner!");

        System.out.print("Round=" + (countE + countO) + ", Win=(E:" + countE + ",O:" + countO + "), ");
        if (countE < countO) {
            System.out.println("Even Left=" + (StackEven - (countE + countO) + countO));
        } else {
            System.out.println("Even Left=" + (StackOdd - (countE + countO) + countE));
        }
    }
}

public class OddEvenQueue {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        Queue Q = new Queue();
        int n = rand.nextInt(9, 21);

        System.out.println("--- Random Numbers [" + n + "] ---");
        for (int i = 0; i < n; i++) {
            int N = rand.nextInt(100) + 1;
            System.out.print(N + " ");
            if (N % 2 == 0) {
                Q.addEven(N);
            } else {
                Q.addOdd(N);
            }
            count++;
        }
        System.out.println();
        System.out.println("--- Even Queue [" + Q.getEvenSize() + "] --- ");
        System.out.println(Q.toStringEven());
        System.out.println("--- Odd Queue [" + Q.getOddSize() + "] --- ");
        System.out.println(Q.toStringOdd());
        Q.winner();
    }
}
