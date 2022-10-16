package j101;

import java.util.Arrays;

public class DizidekiElemanlarınHarmonikOrt {
    public static void main(String[] args) {

        int[] arr = {1,6,8};

        double sum = 0.0;

        for (int i = 0;i < arr.length;i++) {
            sum += 1.0 / arr[i];
        }

        System.out.println("Harmonik ortalama: " + arr.length / sum);

    }
}
