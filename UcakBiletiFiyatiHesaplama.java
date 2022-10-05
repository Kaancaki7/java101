package j101;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double perKm = 0.10;
        double tutar, saleTutar, sale2tutar;


        Scanner input = new Scanner(System.in);

        System.out.print("gideceğiniz mesafeyi giriniz:");
        mesafe = input.nextInt();
        if (mesafe <= 0) {
            System.out.println("hatalı mesafe değeri girdiniz.");
        } else {
            System.out.print("yaşınızı giriniz:");
        }
        yas = input.nextInt();
        if (yas <= 0) {
            System.out.println("jatalı yaş girdiniz!");
        } else if (yas > 0 && yas <= 12) {
            System.out.printf("1: Tek yön%n2: Gidiş-dönüş");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.50;
                    tutar = tutar - saleTutar;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                case 2:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.50;
                    tutar = tutar - saleTutar;
                    sale2tutar = tutar * 0.20;
                    tutar = (tutar - sale2tutar) * 2;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                default:
                    System.out.println("hatalı bir değer girdiniz.");
                    break;
            }
        } else if (yas > 12 && yas < 24) {
            System.out.printf("1: Tek yön%n2: Gidiş-dönüş");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.10;
                    tutar = tutar - saleTutar;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                case 2:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.10;
                    tutar = tutar - saleTutar;
                    sale2tutar = tutar * 0.20;
                    tutar = (tutar - sale2tutar) * 2;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                default:
                    System.out.println("hatalı bir değer girdiniz.");
                    break;
            }
        } else if (yas >= 24 && yas <= 65) {
            System.out.printf("1: Tek yön%n2: Gidiş-dönüş");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1:
                    tutar = mesafe * perKm;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                case 2:
                    tutar = mesafe * perKm;
                    sale2tutar = tutar * 0.20;
                    tutar = (tutar - sale2tutar) * 2;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                default:
                    System.out.println("hatalı bir değer girdiniz.");
                    break;
            }
        } else {
            System.out.printf("1: Tek yön%n2: Gidiş-dönüş");
            yolculukTipi = input.nextInt();
            switch (yolculukTipi) {
                case 1:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.30;
                    tutar = tutar - saleTutar;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                case 2:
                    tutar = mesafe * perKm;
                    saleTutar = tutar * 0.30;
                    tutar = tutar - saleTutar;
                    sale2tutar = tutar * 0.20;
                    tutar = (tutar - sale2tutar) * 2;
                    System.out.printf("toplam tutar = %.2f%n", tutar);
                    break;

                default:
                    System.out.println("hatalı bir değer girdiniz.");
                    break;
            }
        }
    }
}
