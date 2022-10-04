package j101;
import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int  mat, fizik, kimya, turkce, tarih, muzik;
        double ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.print("fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.print("türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.print("tarih notunuzu giriniz:");
        tarih = inp.nextInt();
        System.out.print("muzik notunuzu giriniz:");
        muzik = inp.nextInt();

        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.printf("ortalama = %.2f%n",ort);
    }
}
