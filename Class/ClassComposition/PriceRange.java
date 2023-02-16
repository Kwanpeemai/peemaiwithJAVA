package Class.ClassComposition;

import java.util.Scanner;

class ProductInfo {
    public String name;
    public int[] prices;
    public int minprice;
    public int maxprice;
    
    public ProductInfo(String name, int[] prices){
        this.name = name;
        this.prices = prices;
        minprice = Integer.MAX_VALUE;
        maxprice = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minprice){
                minprice = prices[i];   
            }
            if (prices[i]>maxprice){
                maxprice = prices[i];
            }
        }
    }
    
    void printInfo(){
        System.out.println(name + " " + minprice + " " + maxprice);
    }
    
}
public class PriceRange {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 String name = scan.next();
 int N = scan.nextInt();
 int[] prices = new int[N];
 for(int i = 0; i < N; ++i)
 prices[i] = scan.nextInt();
 ProductInfo pInfo = new ProductInfo(name, prices);
 pInfo.printInfo();
 }
}

