package data;

import java.util.Random;

class Tree {
    private Object info;
    private Tree left;
    private Tree right;

    public Tree(Object info, Tree left, Tree right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public Tree(Object info) {
        this(info, null, null);
    }

    public Tree() {
        this(null, null, null);
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo() {
        this.info = info;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public void setRight() {
        this.right = right;
    }

    public void insert(Object newInfo) {
        if (info == null) {
            info = newInfo;
        } else if ((int) info > (int) newInfo) {
            if (left != null) {
                left.insert(newInfo);
            } else {
                left = new Tree(newInfo);
            }
        } else {
            if (right != null) {
                right.insert(newInfo);
            } else {
                right = new Tree(newInfo);
            }
        }
    }

    public static int countNode(Tree tree) {
        if (tree == null)
            return 0;
        int count = 1;
        count += countNode(tree.getLeft());
        count += countNode(tree.getRight());
        return count;
    }

    public int height(Tree tree) {
        if (tree == null) {
            return -1;
        }
        int l = height(tree.left);
        int r = height(tree.right);
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }

    public static void printPreOrder(Tree tree) {
        if (tree == null) {
            System.out.print(" - ");
            return;
        }
        if (tree.getLeft() == null && tree.getRight() == null) {
            return;
        }
        System.out.print(" " + tree.getInfo() + " ");
        System.out.print("[");
        printPreOrder(tree.getLeft());
        printPreOrder(tree.getRight());
        System.out.print("]");
    }

    boolean search(Tree tree, int data) {
        if (tree == null) {
            return false;
        }
        if ((int) tree.getInfo() == data) {
            return true;
        }
        if (data < (int) tree.getInfo()) {
            System.out.print("L");
            return search(tree.left, data);
        } else {
            System.out.print("R");
            return search(tree.right, data);
        }
    }

}

public class FindTree {
    public static void main(String[] args) {
        Random rand = new Random();
        Tree T = new Tree();
        int n = rand.nextInt(10) + 11;
        System.out.println("---Random numbers [" + n + "] ---");

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(50);
            System.out.print(num + " ");
            T.insert(num);
        }
        System.out.println("");
        System.out.println("--- Tree (Height=" + T.height(T) + ") ---");
        T.printPreOrder(T);
        System.out.println();

        for (;;) {
            int target = rand.nextInt(51);
            System.out.print(target + ": (");
            boolean found = T.search(T, target);
            if (found) {
                System.out.print(")");
                System.out.println(" Found!");
                break;
            } else {
                System.out.print(")");
                System.out.println(" Not Found!");
            }
        }

    }
}
