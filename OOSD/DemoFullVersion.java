package OOSD;

import java.util.ArrayList;

// 1. สร้าง Iterator Interface
interface MyIterator {
    boolean hasNext();

    Object next();
}

// 2. สร้าง Aggregate Interface
interface IterableCollection {
    MyIterator createIterator();
}

// 3. สร้าง ConcreteIterator
class MyConcreteIterator implements MyIterator {
    private ArrayList<String> items;
    private int position = 0;

    public MyConcreteIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}

// 4. สร้าง ConcreteAggregate
class MyConcreteCollection implements IterableCollection {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public MyIterator createIterator() {
        return new MyConcreteIterator(items);
    }
}

public class DemoFullVersion {
    public static void main(String[] args) {
        MyConcreteCollection collection = new MyConcreteCollection();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        MyIterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
