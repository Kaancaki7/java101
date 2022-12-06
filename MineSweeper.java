package j101;



public class MineSweeper {

    static void colRow(int col, int row) {
        int arr[][] = new int[col][row];

        for (int i = 0;i < arr.length; i++) {
            for (int j = 0;j < arr[i].length;j++) {
                System.out.print("-" + " ");
            }
            System.out.println();
        }
    }
}
