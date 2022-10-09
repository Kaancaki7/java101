package j101;

import java.util.Scanner;

public class AsalSayiBulan {
    public static void main(String[] args) {

        System.out.println("1-100 arasindaki asal sayilar:");

        for (int i = 1;i <= 100;i++) {
            int sayac = 0;
            for (int j = i;j >= 1;j--) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac == 2) {
                System.out.println(i);
            }
        }
    }
}

