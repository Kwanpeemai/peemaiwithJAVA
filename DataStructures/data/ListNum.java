package data;

class Node {
    private int info;
    private Node link;

    public Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }

    public Node(int info) {
        this(info, null);
    }

    public Node() {
        this(0, null);
    }

    public int getInfo() {
        return this.info;
    }

    public Node getLink() {
        return this.link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public String toString() {
        return "" + this.info;
    }
}

public class ListNum {
    private Node head = null;
    int size;

    public ListNum() {

    }

    public void addNode(int newInfo) {
        Node newNode = new Node(newInfo);
        newNode.setLink(head);
        head = newNode;
        size++;
    }

    public void addLast(int newInfo) {
        Node newNode = new Node(newInfo);
        Node p = head;
        while (p.getLink() != null) {
            p = p.getLink();
        }
        p.setLink(newNode);
        size++;
    }

    public void addNum(int num) {
        Node newNode = new Node(num);
        Node n1 = head;
        Node n2 = head;
        if (n1.getInfo() < num || size == 0) {
            addNode(num);
        } else {
            while (num < n1.getInfo() && n1.getLink() != null) {
                n2 = n1;
                n1 = n1.getLink();
            }

            if (n1.getLink() == null) {
                n1.setLink(newNode);
            } else {
                newNode.setLink(n2.getLink());
                n2.setLink(newNode);

            }
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void removeFirst() {
        Node f = head.getLink();
        head = f;
        size--;
    }

    public void removeLast() {
        Node n1 = head;
        Node n2 = n1;
        while (n1 != null && n1.getLink() != null) {
            n2 = n1;
            n1 = n1.getLink();
        }
        n2.setLink(null);
        size--;
    }

    public void removeNum(int num) {
        Node n1 = head;
        Node n2 = head;
        while (n1.getInfo() != num) {
            n2 = n1;
            n1 = n1.getLink();
        }
        n2.setLink(n2.getLink().getLink());
        size--;
    }

    public int searchNum(int num) {
        Node n = head;
        int count = 1;
        while (n.getInfo() != num) {
            n = n.getLink();
            count++;
        }
        return count;
    }

    public String toString() {
        Node trav = head;
        String str = "";
        while (trav != null) {
            str = str.concat(trav.toString());
            // str=str.concat(""+trav.getInfo());
            trav = trav.getLink();
            if (trav != null)
                str = str.concat(" | ");
        }
        return str;
    }

    public static void main(String[] args) {
        ListNum listNum1 = new ListNum();
        listNum1.addNode(10);
        listNum1.addNode(20);
        listNum1.addNode(30);
        System.out.println(listNum1);
        System.out.println("size : " + listNum1.getSize());

        listNum1.addLast(78);
        System.out.println(listNum1);
        System.out.println("size : " + listNum1.getSize());

        listNum1.removeFirst();
        System.out.println(listNum1);
        System.out.println("size : " + listNum1.getSize());
    }
}