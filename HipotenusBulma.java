package j101;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        double a = input.nextDouble();
        System.out.print("b kenarını giriniz:");
        double b = input.nextDouble();
        double hip;
        hip = Math.sqrt(a * a + b * b);
        System.out.printf("a: %.2f%nb: %.2f%nhipotenus:%.2f%n",a, b, hip);
    }
}
