package j101;

import java.util.Arrays;

public class TekrarEdenCiftSayiBulan {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] list = {2,7,2,3,2,9,10,21,1,33,9,1,8,8};

        int[] evenDublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length;i++) {
            for (int j = 0; j < list.length;j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(evenDublicate , list[i])) {
                        evenDublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int i : evenDublicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
