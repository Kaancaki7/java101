package j101;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        boolean leapYear = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("yıl giriniz:");
        year = inp.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
            else {
                leapYear = false;
            }
        }
        else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.printf("%d yılı artık bir yıldır.",year);
        }
        else {
            System.out.printf("%d yılı artık bir yıl değildir.",year);
        }
    }
}