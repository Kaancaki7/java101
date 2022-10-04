package j101;

import java.util.Scanner;

public class TaksimetreProg {
    public static void main(String[] args) {
        double acilisUcret = 10;
        double toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç Km gidildi:");
        double km = input.nextDouble();
        toplamTutar = km * 2.20;
        if (toplamTutar + acilisUcret <= 20)
        {
            System.out.printf("Borcunuz: %.2f%nTL'dir",20.0);
        }
        else {
            System.out.printf("Borcunuz: %.2f%nTL'dir",toplamTutar + acilisUcret);
        }


    }
}
