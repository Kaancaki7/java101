package j101;

import java.util.Scanner;

public class VücutKitleİndex {
    public static void main(String[] args) {

        //veri girişini aktif hale getirelim
        Scanner input = new Scanner(System.in);

        //veri türleri
        double boy,kilo, kitleIndex;

        //ilk veriyi isteyelim
        System.out.print("Lüften boyunuzu metre cinsinden giriniz : ");
        boy= input.nextDouble();
        //ilinci veriyi isteyelim
        System.out.print("Lüften kilonusu kg cinsinden giriniz : ");
        kilo = input.nextDouble();

        //formül
        kitleIndex = kilo/(boy*boy) ;

        //son çıktı
        System.out.println("Vücut kitle indeksiniz : " + kitleIndex);

    }

}
