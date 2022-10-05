package j101;

import java.util.Scanner;

public class HavayaGoreEtkinlikOnerisi {
    public static void main(String[] args) {
        int sicaklik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bulunduğunuz yerin sıcaklığını giriniz:");
        sicaklik = inp.nextInt();

        if (sicaklik < 5)
            System.out.println("Bugün kayak için güzel bir gün :)");
        else if (5 <= sicaklik && sicaklik < 15 )
            System.out.println("Bugün sinemaya gitmek için güzek bir gün :)");
        else if (15 <= sicaklik && sicaklik < 25)
            System.out.println("Bugün piknik için güzel bir gün :)");
        else
            System.out.println("bugün yüzmek için güzel bir gün :)");

    }
}
