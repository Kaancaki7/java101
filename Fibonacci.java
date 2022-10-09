package j101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int number,n3;
        int n2 = 1;
        int n1 = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayi giriniz:");
        number = inp.nextInt();

        for (int i = 2;i <= number;i++){
            n3 = n1 + n2;
            System.out.println(n1 + " + " +n2 + " = " +n3);
            n1 = n2;
            n2 = n3;
            System.out.println();
        }


    }
}
