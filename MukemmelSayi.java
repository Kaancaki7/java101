package j101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz:");
        number = inp.nextInt();

        for (int i = number - 1;i >= 1;i--) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.printf("%d sayisi mükemmel sayidir.",number);
        }
        else {
            System.out.printf("%d sayisi mükemmel sayi değildir.",number);
        }

    }
}
