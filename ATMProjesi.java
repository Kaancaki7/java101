package j101;

import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 2000;
        int amount;
        Scanner sc = new Scanner(System.in);

        while (right > 0) {
            System.out.println("kullanıcı adınızı giriniz:");
            userName = sc.nextLine();
            System.out.println("parolanızı giriniz:");
            password = sc.nextLine();

            if (userName.equals("kaancaki") && password.equals("kaancaki777")) {
                System.out.println("Hoşgeldiniz.");
                do {
                    System.out.println("Size nasıl yardımcı olabilirim:");
                    System.out.printf("1-Para çekme%n2-Para yatırma%n3-Bakiye sorgu%n4-Çıkış%n");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek istediğiniz miktarı giriniz:");
                            amount = sc.nextInt();
                            if (amount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                System.out.println("Paranız çekiliyor...");
                                balance -= amount;
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                            amount = sc.nextInt();
                            System.out.println("paranız yatırılıyor...");
                            balance += amount;
                            break;
                        case 3:
                            System.out.printf("Bakiyeniz: %d%n", balance);
                            break;
                        case 4:
                            System.out.println("Güle Güle :)");
                            break;
                        default:
                            System.out.println("Lütfen işlem seçimini doğru giriniz.");
                            break;
                    }

                } while (select != 4);
            }
            else{
                    --right;
                    System.out.println("Kullanıcı adınız veya parolanız hatalı. lütfen tekrar deneyiniz");
                    System.out.printf("Kullanım hakkı: %d%n", right);
                }


        }
    }
}