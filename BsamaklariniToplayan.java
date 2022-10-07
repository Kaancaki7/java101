package j101;

import java.util.Scanner;
public class BsamaklariniToplayan {
    public static void main(String[] args) {

        int basValue;
        int result = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int number = inp.nextInt();

        int tempNumber = number;

        while (tempNumber != 0){
             basValue = tempNumber % 10;
             result += basValue;
             tempNumber /= 10;
        }
        System.out.printf("%d sayısının bsamakları toplamı = %d",number,result);
    }
}
