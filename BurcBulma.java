package j101;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.print("kaçıncı ayda doğdunuz:");
        month = input.nextInt();

        System.out.print("hangi gün doğdunuz:");
        day = input.nextInt();

        switch (month)
        {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("oğlak burcusunuz");
                    } else {
                        System.out.println("kova burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz.");
                }
                break;

            case 2:
            if (day >= 1 && day <= 31) {
                if (day < 20){
                    System.out.println("kova burcusunuz");
                }
                else {
                    System.out.println("balık burcusunuz");
                }
            }
            else {
                System.out.println("geçersiz gün girdiniz");
            }
            break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21){
                        System.out.println("balık burcusunuz");
                    }
                    else {
                        System.out.println("koç burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 4:
                if (day >= 1 && day <= 31) {
                    if (day < 21){
                        System.out.println("kova burcusunuz");
                    }
                    else {
                        System.out.println("boğa burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22){
                        System.out.println("boğa burcusunuz");
                    }
                    else {
                        System.out.println("ikizler burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23){
                        System.out.println("ikizler burcusunuz");
                    }
                    else {
                        System.out.println("yengeç burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23){
                        System.out.println("yengeç burcusunuz");
                    }
                    else {
                        System.out.println("aslan burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23){
                        System.out.println("aslan burcusunuz");
                    }
                    else {
                        System.out.println("başak burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23){
                        System.out.println("başak burcusunuz");
                    }
                    else {
                        System.out.println("terazi burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23){
                        System.out.println("terazi burcusunuz");
                    }
                    else {
                        System.out.println("akrep burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22    ){
                        System.out.println("akrep burcusunuz");
                    }
                    else {
                        System.out.println("yay burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22){
                        System.out.println("yay burcusunuz");
                    }
                    else {
                        System.out.println("oğlak burcusunuz");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz");
                }
                break;

            default:
                System.out.println("hatalı bir ay girdiniz.");
                break;
        }
    }
}
