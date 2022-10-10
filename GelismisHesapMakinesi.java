package j101;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void sum() {
        int number, result = 0;
        int sayac = 1;

        while (true) {
            System.out.print(sayac++ + ".sayi:");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.printf("result : %d%n", result);
    }

    static void minus() {
        int number, result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("kaç adet sayı gireceksiniz:");
        int counter = sc.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayi:");
            number = sc.nextInt();

            if (i == 1) {
                result += number;
            }
            result -= number;
        }
        System.out.printf("Result : %d%n", result);
    }

    static void multiply() {
        int number, result = 1;
        int i = 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(i++ + ".sayi:");
            number = sc.nextInt();

            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.printf("result : %d%n", result);
    }

    static void divided() {
        int counter;
        double number, result = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("kaç adet sayı gireceksiniz:");
        counter = sc.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayi:");
            number = sc.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("böleni sıfır giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.printf("result : %.2f%n", result);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("taban değerini giriniz:");
        int base = sc.nextInt();
        System.out.print("kuvvet değerini giriniz:");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.printf("pow(%d,%d) = %d%n", base, exp, result);
    }

    static void fact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("faktoriyelini öğrenmek istediğiniz sayıyı giriniz:");
        int number = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.printf("fact(%d) = %d%n", number, result);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("MENU:%n1-Toplama%n2-Çıkarma%n3-Çarpma%n4-Bolme%n5-Us alma%n6-faktoriyel hesaplama%n0-Çıkış%n");
        int select = sc.nextInt();

        do {

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 0:
                    System.out.print("Çıkış yapıldı.");
                    break;
                default:
                    System.out.println("hatalı bir değer girdiniz.");
                    break;
            }
        } while (select != 0);

    }
}