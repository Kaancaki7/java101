package j101;

import java.util.Scanner;

public class DikdortgenAlanveCevreYTA {
    public static double areaCalculate(double aEdge, double bEdge) {
        double areaResult = aEdge * bEdge;
        return areaResult;
    }

    public static double perimeterCalculate(double aEdge, double bEdge) {
        double perimeterResult = (2 * aEdge) + (2 * bEdge);
        return perimeterResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A kenarini giriniz : ");
        double aEdge = sc.nextDouble();
        System.out.print("B kenarini giriniz : ");
        double bEdge = sc.nextDouble();

        System.out.print("Area : " + areaCalculate(aEdge,bEdge) + "\n");
        System.out.println("Perimeter : " + perimeterCalculate(aEdge,bEdge));
    }
}
