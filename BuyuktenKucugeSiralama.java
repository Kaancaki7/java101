package j101;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("a sayısını giriniz:");
        a = inp.nextInt();

        System.out.print("b sayısını giriniz:");
        b = inp.nextInt();

        System.out.print("c sayısını giriniz:");
        c = inp.nextInt();

        if ((a == b || a == c) || (b == c || b == a) || (c == a || c == b))
        {
            System.out.println("program sonlandı.");

        }

        if (a > c && a > b)
        {
            if (c > b) {
                System.out.println("a > c > b");
            } else
            {
                System.out.println("a > b > c");
            }
        }
        else if (b > a && b > c)
        {
           if (a > c)
               System.out.println("b > a > c");
           else
               System.out.println("b > c > a");
        }
        else if (c > a && c > b)
        {
            if (a > b)
                System.out.println("c > a > b");
            else
                System.out.println("c > b > a");
        }
    }
}
