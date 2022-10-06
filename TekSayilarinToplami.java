package j101;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int x,sum = 0;

        Scanner inp = new Scanner(System.in);

        while(true) {
            System.out.print("bir sayi giriniz:");
            x = inp.nextInt();

            if (x < 0) {
                System.out.println("program sonlanıyor...");
                break;
            }
            if(x % 2 != 0) {
                sum += x;
                System.out.printf("toplam =  %d%n",sum);
            }
        }
        System.out.printf("program sonlandı. %nGirdiğiniz tek sayıların toplamı : %d",sum);

    }
}
