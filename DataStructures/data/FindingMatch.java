package data;

import java.util.Random;

class LinearProbing {
    private int size;
    private int[] hashTable;
    private int capacity;

    public LinearProbing(int capacity) {
        this.capacity = capacity;
        size = 0;
        hashTable = new int[capacity + 1];
    }

    // หาค่า hash value
    public int hash(int key) {
        return key % capacity;
    }

    public int getSize() {
        return size;
    }

    // ค้นหาข้อมูลในตาราง
    public int get(int key) {
        int index = hash(key);

        while (hashTable[index] != 0) {
            if (hashTable[index] == key) {
                return hashTable[index];
            }
            index++;
        }
        return -1;
    }

    // เพิ่มข้อมูลเข้า hashTable
    public void put(int key) {
        int index = hash(key);
        boolean ch = false;

        while (hashTable[index] != 0) {
            index++;
            ch = true;
        }
        if (!ch) {
            hashTable[index] = key;
        } else
            hashTable[index] = -key;
        size++;
    }

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] > 0) {
                System.out.print(i + ":" + hashTable[i] + " ");
            } else if (hashTable[i] < 0) {
                System.out.print(i + ":" + (-hashTable[i]) + "* ");
            }
        }
    }

    // แสดงข้อมูลทั้งหมดที่เก็บใน hashTable
    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] > 0) {
                System.out.print(i + ":" + hashTable[i] + " ");
            } else if (hashTable[i] < 0) {
                System.out.print(i + ":" + (-hashTable[i]) + "* ");
            }
        }
    }

    // ลบข้อมูลใน hashTable
    public void remove(int key) {
        int index = hash(key);
        hashTable[index] = 0;
        size--;
    }
}

public class FindingMatch {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = rand.nextInt(10, 21);
        LinearProbing linear = new LinearProbing(N * 2);
        int num;

        // 1
        System.out.println("---Random Numbers [" + N + "] ---");
        for (int i = 0; i < N; i++) {
            num = rand.nextInt(101);
            if (linear.get(num) == -1) {
                System.out.print(num + " ");
            } else {
                System.out.print("!" + num + " ");
            }
            linear.put(num);
        }

        // 2
        System.out.println();
        System.out.println("---Hash Table [" + linear.getSize() + "] ---");
        linear.print();

        // 3
        System.out.println();
        System.out.println("---Finding Match ---");
        int c = 0;
        while (c != 3) {
            num = rand.nextInt(101);
            if (100 - num == linear.get(100 - num)) {
                System.out.print(num + " ");
                linear.remove(100 - num);
                c++;
            } else
                System.out.print("!" + num + " ");
        }

        // 4
        System.out.println();
        System.out.println("---Hash Table [" + linear.getSize() + "] ---");
        linear.printHashTable();
    }
}
