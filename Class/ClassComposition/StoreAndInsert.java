package Class.ClassComposition;


import java.util.Scanner;
import java.util.ArrayList;

class ProductInfo1 {

    public String name;
    public int[] prices;
    public int minprice;
    public int maxprice;

    public ProductInfo1(String name, int[] prices) {
        this.name = name;
        this.prices = prices;
        minprice = 1000000;
        maxprice = 1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            if (prices[i] > maxprice) {
                maxprice = prices[i];
            }
        }
    }

    void printInfo() {
        System.out.println(name + " " + minprice + " " + maxprice);
    }
}

class Store {

    private ArrayList<ProductInfo1> products = new ArrayList<>();

    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo1 pInfo = new ProductInfo1(name, prices);
        products.add(pInfo);
    }

    void printAllProductInfo() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo();
        }

    }
}

public class StoreAndInsert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        store.printAllProductInfo();
    }
}

