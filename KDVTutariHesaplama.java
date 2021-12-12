package Patika_alistirmalari;

import java.util.Scanner;

public class KDVTutariHesaplama {

    public static void main(String[] args) {

        int money;
        double newMoney;
        double priceKDV;
        Scanner tara = new Scanner(System.in);
        System.out.println("Please enter money amount: ");
        money = tara.nextInt();

        if(money > 0 && money <= 1000) {
            newMoney =(double)(money*18)/100;
            priceKDV = money+newMoney;
            System.out.println("Price KDV: "+priceKDV);
            System.out.println("Amount of money you entered: "+money+" Value with KDV: "+newMoney);
        }else if(money > 1000) {
            newMoney = (double)(money*8)/100;
            priceKDV = money+newMoney;
            System.out.println("Price KDV: "+priceKDV);
            System.out.println("Amount of money you entered: "+money+" Value with KDV: "+newMoney);
        }
    }
}
