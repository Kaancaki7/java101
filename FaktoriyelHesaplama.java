package j101;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int n = 0;
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Faktoriyelini öğrenmek istediğiniz sayıyı giriniz:");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.printf("%d sayisinin faktı : %d",n,total);
    }
}
