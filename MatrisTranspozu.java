package j101;

import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        System.out.println("MATRİS: ");
        System.out.println("----------------------------");
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRİS TRANSPOZU: ");
        System.out.println("------------------------------");

        for (int j = 0; j < arr[0].length;j++) {
            for (int i = 0;i < arr.length;i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
