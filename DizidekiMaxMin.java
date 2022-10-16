package j101;

import java.util.Arrays;

public class DizidekiMaxMin {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for (int i:list) {
            if (i < min) {
                min = i;
            }
            if (i > max){
                max = i;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        /*2.Yöntem :
        Arrays.sort(list);
        System.out.println("min: " + list[0]);
        System.out.println("max: " + list[6]);
         */
    }
}



