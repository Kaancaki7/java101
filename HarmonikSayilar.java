package j101;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayi giriniz:");
        int number = inp.nextInt();

        double result = 0.0;

        for (double i = 1.0;i <= number;i++) {
            result += (1/i);
        }
        System.out.printf("result : %.2f",result);
    }
}
