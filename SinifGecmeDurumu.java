package j101;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        int toplamDers = 0;
        int toplamNot = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mat notunuzu giriniz:");
        mat = inp.nextInt();
        if (!(mat < 0 || mat > 100))
        {
            toplamNot += mat;
            toplamDers++;
        }

        System.out.print("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();
        if (!(turkce < 0 || turkce > 100))
        {
            toplamNot += turkce;
            toplamDers++;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        if (!(fizik < 0 || fizik > 100))
        {
            toplamNot += fizik;
            toplamDers++;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        if (!(kimya < 0 || kimya > 100))
        {
            toplamNot += kimya;
            toplamDers++;
        }
        System.out.print("Muzik notunuzu giriniz:");
        muzik = inp.nextInt();
        if (!(muzik < 0 || muzik > 100))
        {
            toplamNot += muzik;
            toplamDers++;
        }

        double average = toplamNot / toplamDers;

        if (average >= 55)
            System.out.printf("Ortalamanız: %.2f%nBaşarıyla geçtiniz!",average);
        else
            System.out.printf("Ortalamanız: %.2f%nKaldınız.",average);
    }
}
