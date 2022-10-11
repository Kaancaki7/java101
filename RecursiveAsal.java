package j101;

import java.util.Scanner;

public class RecursiveAsal {

    static void asal(int n) {
        int sayac = 0;
        int result = 0;
        for(int i = n;i >= 1;i--) {
            result = n % i;
            if (result == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            System.out.printf("%d sayisi asal sayi.%n",n);
        }
        else{
            System.out.printf("%d sayisi asal sayi değil.%n",n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.print("sayi giriniz:");
            int number = sc.nextInt();

            if (number == 0 || number == 1) {
                System.out.println("program sonlandı.");
                break;
            }
            asal(number);
        }
    }
}

//recursive yöntemi aşağıdaki:
/*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi=input.nextInt();
        asal(sayi,2);
    }
    static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " asal sayıdır.");
            return;
        } else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);

    }
}

 */