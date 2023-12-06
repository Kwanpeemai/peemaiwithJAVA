package OOSD;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoShortVersion {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
