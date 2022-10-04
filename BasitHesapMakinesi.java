package j101;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int firstN, secondN, selectN;

        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayiyi giriniz:");
        firstN = input.nextInt();
        System.out.print("ikinci sayiyi giriniz:");
        secondN = input.nextInt();

        System.out.printf("1-Toplama%n2-Cikarma%n3-Carpma%n4-Bolme%n");
        System.out.print("yapacaginiz islemi seciniz:");
        selectN = input.nextInt();

        switch (selectN) {
            case 1:
                System.out.printf("%d + %d = %d",firstN, secondN, firstN + secondN);
                break;
            case 2:
                System.out.printf("%d - %d = %d",firstN, secondN, firstN - secondN);
                break;
            case 3:
                System.out.printf("%d * %d = %d",firstN, secondN, firstN * secondN);
                break;
            case 4:
                System.out.printf("%d / %d = %d",firstN, secondN, firstN / secondN);
                break;
        }
    }
}
