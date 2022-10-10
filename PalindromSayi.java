package j101;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int number = sc.nextInt();
        System.out.println(isPalindrom(number));
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0,lastNumber;
        while (temp != 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        }
        else {
            return false;

            }
        }
    }

