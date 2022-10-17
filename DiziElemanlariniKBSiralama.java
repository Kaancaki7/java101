package j101;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariniKBSiralama {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz:");
        int arrLen = sc.nextInt();
        int[] nums = new int[arrLen];
        int count = 1;
        for (int i = 0;i < nums.length;i++) {
            System.out.println(count + ". elemanı giriniz: ");
            nums[i] = sc.nextInt();
            count++;
        }
        Arrays.sort(nums);
        System.out.println("nums dizisinin elemanlarının k > b siralanisi: ");
        System.out.println(Arrays.toString(nums));
    }
}
