package j101;

import java.util.Scanner;
public class UceVeDordeTamBolunen {
    public static void main(String[] args) {

        int x;
        int sum = 0;
        int sayac = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        x = inp.nextInt();

        for(int i = 0;i < x; i++) {
            if (i % 3 == 0) {
                if (i % 4 == 0) {
                    sum += i;
                    sayac++;
                }
            }
            continue;
        }
        System.out.printf("3'e ve 4'e bölünenlerin ortlaması: %d",sum / sayac);
    }
}
