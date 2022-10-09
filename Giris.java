package j101;

import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
      int n1;
      int n2;

      Scanner sc = new Scanner(System.in);
        System.out.println("gir");
        n1 = sc.nextInt();
        System.out.println("gir");
        n2 = sc.nextInt();
        for (int i = 1;i <= (n1*n2);i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
