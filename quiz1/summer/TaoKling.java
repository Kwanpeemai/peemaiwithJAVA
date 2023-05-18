package quiz1.summer;

import java.util.Scanner;

class TaoKlingOrder{
    int nummilk, numjuice, numwater, total;
    String phoneno, code;
    boolean completed = true;

    TaoKlingOrder (String phoneno, int n1, int n2, int n3, String code){
        nummilk = 0;
        numjuice = 0;
        numwater = 0;
        if (n1 > 0) nummilk = n1;
        if (n2 > 0) numjuice = n2;
        if (n3 > 0) numwater = n3;

        if (phoneno.length() == 10 && phoneno.charAt(0) == '0'){
            this.phoneno = phoneno;
        } else {
            this.phoneno = "0#########" + "";
            System.out.println("invalid phone number");
            completed = false;
        }
        total = (n1*10) + (n2*20) + (n3*15);
        this.code = code;
    }
    boolean grabOrder (String phone, String code1){
        if (phone.equals(phoneno) && code1.equals(code)) {
            completed = true;
        }else {
            completed = false;
        }
        return completed;
    }
    void printInfo (){
        System.out.print(phoneno + " " + nummilk + " " + numjuice + " " + numwater + " " + total + " ");
        if (completed) {
        System.out.print("Y");
        }else{
         System.out.print("N");
        }
    }
}
public class TaoKling {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String phoneNo = sc.next();
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    String code = sc.next();
    TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1,n2,n3,code);
    String phone = sc.next();
    String code1 = sc.next();
    boolean flag = t.grabOrder(phone,code1);
    System.out.println(flag);
    t.printInfo();
    }
}