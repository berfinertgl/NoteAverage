package Patika_alistirmalari;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        int math, physics, chemistry, turkish, history, music;
        double average=0;
        boolean result1, result2;
        result1 = average > 60;
        result2 = average <= 60;
        System.out.println("Please enter math note: ");
        math = tara.nextInt();
        System.out.println("Please enter physics note: ");
        physics = tara.nextInt();
        System.out.println("Please enter chemistry note: ");
        chemistry = tara.nextInt();
        System.out.println("Please enter turkish note: ");
        turkish = tara.nextInt();
        System.out.println("Please enter history note: ");
        history = tara.nextInt();
        System.out.println("Please enter music note: ");
        music = tara.nextInt();

        average = (double)(math+physics+chemistry+turkish+history+music) / 6.0;
        System.out.println("Your note average is: "+average);
        System.out.println("You have passed. "+result1);
        System.out.println("You have not passed, sorry. "+result2);

    }
}
