package j101;

import java.util.Scanner;

public class DaireAlanıVeCevresi {
    public static void main(String[] args) {
        double alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("yaricap degerini giriniz:");
        int r = input.nextInt();

        alan = Math.PI * r * r;
        cevre = 2 * Math.PI * r;

        System.out.printf("yaricapi : %d olan dairenin alani: %.2f%n", r, alan);
        System.out.printf("yaricapi : %d olan dairenin cevresi : %.2f%n", r, cevre);

    }
}
