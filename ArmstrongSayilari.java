package j101;

import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {

        int tempNumber;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int number = inp.nextInt();
        tempNumber = number;   //number değeri kaybolmaması için geçici değer atadık.

        //basamak sayısını bulduk burada

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.printf("basamak sayısı : %d%n",basNumber);

        //basamaklarına ayırıp işlem yapacağız.

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1;i <= basNumber;i++) {
                basPow *= basValue;

            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.printf("%d sayısı armstrong bir sayıdır.%nSonuc = %d",number,result);
        }
        else{
            System.out.printf("%d sayısı armstrong bir sayı DEGİLDİR.%nSonuc = %d",number,result);
        }

    }
}
