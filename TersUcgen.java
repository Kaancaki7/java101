package j101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("basamak sayisini giriniz:");
        int bas = sc.nextInt();

        for (int i = 1;i <= bas;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= ((2*bas) - (2*i) + 1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
