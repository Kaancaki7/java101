package j101;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int taban, kuvvet,result = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("taban değerini giriniz:");
        taban = sc.nextInt();
        System.out.print("kuvvet değerini giriniz:");
        kuvvet = sc.nextInt();

        for (int i = 0;i < kuvvet;i++) {
            result *= taban;
        }
        System.out.printf("%d^%d = %d",taban,kuvvet,result);
    }
}
