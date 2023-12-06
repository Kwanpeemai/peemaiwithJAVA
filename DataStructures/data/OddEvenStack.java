package data;

import java.util.Random;

class NodeOdd {
    private int info;
    private NodeOdd link;

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
        return "" + this.info;
    }
}

class List {
    private NodeEven headE = null;
    private NodeOdd headO = null;
    private int StackEven = 0;
    private int StackTop = 0;

    public void addEven(int newInfo) {
        NodeEven newNode = new NodeEven(newInfo);
        newNode.setLink(headE);
        headE = newNode;
        StackEven++;
    }

    public void addOdd(int newInfo) {
        NodeOdd newNode = new NodeOdd(newInfo);
        newNode.setLink(headO);
        headO = newNode;
        StackTop++;
    }

    public int getEvenSize() {
        return StackEven;
    }

    public int getOddSize() {
        return StackTop;
    }

    public String toStringEven() {
        NodeEven trav = headE;
        String str = "";
        while (trav != null) {
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str;
    }

    public String toStringOdd() {
        NodeOdd trav = headO;
        String str = "";
        while (trav != null) {
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str;
    }

    public void winner() {
        NodeEven Even = headE;
        NodeOdd Odd = headO;
        int countE = 0;
        int countO = 0;
        while (Even.getLink() != null && Odd.getLink() != null) {
            if (Even.getInfo() > Odd.getInfo())
                countE++;
            else
                countO++;

            Even = Even.getLink();
            Odd = Odd.getLink();
        }
        if (Even.getInfo() > Odd.getInfo())
            countE++;
        else
            countO++;
        if (countE > countO)
            System.out.println("===> Even is the winner");
        else
            System.out.println("===> Odd is the winner!");
    }
}

public class OddEvenStack {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        List l = new List();
        int n = rand.nextInt(9, 21);

        System.out.println("--- Random Numbers [" + n + "] ---");
        for (int i = 0; i < n; i++) {
            int N = rand.nextInt(100) + 1;
            System.out.print(N + " ");
            if (N % 2 == 0) {
                l.addEven(N);
            } else {
                l.addOdd(N);
            }
            count++;
        }
        System.out.println();
        System.out.println("--- Even Stack [" + l.getEvenSize() + "] ---");
        System.out.println(l.toStringEven());
        System.out.println("--- Odd Stack [" + l.getOddSize() + "] ---");
        System.out.println(l.toStringOdd());
        l.winner();
    }
}
