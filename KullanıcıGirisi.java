//patika için eksik kod oludğunun farkındayım pratik için yazıyorum istenielni yaptım burada sadece daha geliştirilebilir.

package j101;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("kullanici adinizi giriniz:");
        userName = input.nextLine();

        System.out.print("parolanizi giriniz:");
        password = input.nextLine();

        if (userName.equals("kaancaki") && password.equals("kaan123"))
        {
            System.out.println("başarıyla giriş yaptınız.");
        }
        else
        {
            System.out.println("bilgilerniz yanlış.");
            System.out.print("şifrenizi sıfırlamak ister misiniz?(e/h)");
            String answer = input.nextLine();
            if (answer.equals("e") || answer.equals("E"))
            {
                System.out.print("yeni şifrenizi giriniz:");
                String newPassword = input.nextLine();
                if (newPassword.equals("kaancaki123"))
                {
                    System.out.println("eski şifreniz ile aynı olamaz.Lütfen başka şifre giriniz");
                }
                else
                {
                    System.out.println("şifre başarıyla oluşturuldu.");
                }
            }

        }

    }
}

