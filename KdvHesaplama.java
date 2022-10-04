package j101;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("tutarı giriniz:");
        double para = input.nextDouble();

        if (para > 0 && para < 1000)
        {
            double kdv = 0.18;
            para += para * kdv;
            System.out.printf("kdv'li fiyat : %f%nkdv tutarı : %f%n",para, kdv);
        }
        else if (para >= 1000)
        {
            double kdv = 0.08;
            para += para * kdv;
            System.out.printf("kdv'li fiyat : %f%nkdv : %f%n",para, kdv);
        }
        else
        {
            System.out.println("lütfen geçerli bir tutar giriniz.");
        }
    }
}
