package j101;

import java.util.Scanner;

public class RecursivePower {


    static int pow(int base,int exp) {

        if (exp == 0)
            return 1;
        return base * pow(base, exp - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Taban:");
            int base = sc.nextInt();
            System.out.print("Üs:");
            int exp = sc.nextInt();
            if (base == 0) {
                System.out.println("result:" + pow(base,exp));
                System.out.println("Porgram sonlandırıldı.");
                break;
            }
            else {
                System.out.printf("pow(%d,%d) = %d%n",base,exp,pow(base,exp));
            }
        }

    }
}
