package j101;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bmi {
    public static double bmiHesapla(double kilo, double boy) {
        double bmiResult = kilo / (boy * boy);
        return bmiResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilo giriniz (kg) : ");
        double kilo = sc.nextDouble();
        System.out.print("Boy giriniz (m) : ");
        double boy = sc.nextDouble();

        System.out.println("BMI index : " + bmiHesapla(kilo,boy));
    }
}

