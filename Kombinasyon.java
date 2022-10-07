package j101;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int totalN = 1;
        int totalNr = 1;
        int totalr = 1;
        int result;
        System.out.println("Kombinasyon için C(N,r) değerleri giriniz:");
        Scanner inp = new Scanner(System.in);
        System.out.print("n değerini giriniz:");
        int N = inp.nextInt();
        System.out.print("r değerini giriniz");
        int r = inp.nextInt();

        for (int i = 1; i <= N; i++) {
            totalN *= i;
        }
        for (int i = 1;i <= r; i++) {
            totalr *= i;
        }
        for (int i = 1; i <= (N-r); i++) {
            totalNr *= i;
        }
        result = totalN / (totalr * totalNr);
        System.out.printf("C(%d,%d) = %d",N,r,result);
    }
}
