package j101;

import java.util.Arrays;

public class DizidekiElemanlar─▒nOrtalamas─▒ {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,77};

        double sum = 0;
        for (int i = 0; i < numbers.length;i++) {
            sum += numbers[i];
        }

        System.out.println("Result: " + (sum / numbers.length));

    }
}
