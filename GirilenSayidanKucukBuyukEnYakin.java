package j101;

import java.util.Scanner;
import java.util.Arrays;

public class GirilenSayidanKucukBuyukEnYakin {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int n = sc.nextInt();

        Arrays.sort(list);
        for (int i : list){
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }

        System.out.printf("%d sayisina en yakin min değer: %d%n",n,min);
        System.out.printf("%d sayisina en yakin max değer: %d%n",n,max);



    }
}
