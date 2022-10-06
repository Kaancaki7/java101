package j101;

import java.util.Scanner;

public class CiftSayiBulanProgram {
    public static void main(String[] args) {

        int x;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        x = inp.nextInt();

        for(int i = 0;i < x; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
