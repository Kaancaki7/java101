package j101;

import java.util.Scanner;

public class GirilenSayilardanMinVeMaxBulma {
    public static void main(String[] args) {

        int number,max = 1,min = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n = inp.nextInt();

        for (int i = 1;i <= n; i++) {
            System.out.print(i + ". sayiyi giriniz:");
            number = inp.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
        System.out.print("En büyük sayi:" + max + "\n");
        System.out.println("En küçük sayi:" + min);

    }
}
