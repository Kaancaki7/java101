package j101;

import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);

        int right  = 0;
        int[] wrong = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz:");
            int selected = sc.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 - 100 arasında bir sayı giriniz.");
                continue;
            }

            if (selected == number) {
                System.out.println("tebrikler doğru tahmin! Gizli sayi : " + number);
                isWin = true;
                break;
            }
            else {
                System.out.println("Hatalı bir sayi girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " girdiğiniz sayi gizli sayıdan büyüktür.");
                }
                else {
                    System.out.println(selected + " girdiğiniz sayı gizli sayıdan küçüktür");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hak : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz :(");
            System.out.println("tahminleriniz : " + Arrays.toString(wrong));
            System.out.println("Gizli sayi : " + number);
        }

    }

}
