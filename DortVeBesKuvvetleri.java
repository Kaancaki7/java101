package j101;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = inp.nextInt();

        System.out.println("girilen sayıdan küçük 4'ün kuvvetleri:");
        for (int i = 1;i < n;i *= 4) {
            System.out.println(i);
        }
        System.out.println("girilen sayıdan küçük 5'in kuvvetleri:");
        for (int i = 1;i < n;i *= 5) {
            System.out.println(i);
        }
    }
}
