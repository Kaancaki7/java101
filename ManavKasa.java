package j101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        /*  meyveler ve kg fiyatları:
        armut : 2.14
        elma : 3.67
        domates : 1.11
        muz : 0.95
        patlıcan : 5.00
        */

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo:");
        armutKg = input.nextDouble();
        System.out.print("Elma kaç kilo:");
        elmaKg = input.nextDouble();
        System.out.print("Domates kaç kilo:");
        domatesKg = input.nextDouble();
        System.out.print("Muz kaç kilo:");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan kaç kilo:");
        patlicanKg = input.nextDouble();

        toplamTutar = (armutKg * 2.14) + (elmaKg * 3.67) + (domatesKg * 1.11) + (muzKg * 0.95) + (patlicanKg * 5.00);
        System.out.printf("Toplam tutar : %.2f",toplamTutar);
    }
}
