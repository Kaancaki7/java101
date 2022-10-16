//B HARFİ BASIYORUZ
package j101;

import java.util.Arrays;

public class CokBoyutluDizilerBHarfiBastirma {
    public static void main(String[] args) {

        String[][] matris = new String[5][4];

        for (int i = 0; i < matris.length;i++) {
            for (int j = 0; j < matris[i].length;j++) {

                if (i == 0 || i == 2 || i == 4) {
                    matris[i][j] = " * ";
                }
                else if (j == 0 || j == 3) {
                    matris[i][j] = " * ";
                }
                else {
                    matris[i][j] = "   ";
                }
            }
        }

        for (String[] row : matris) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
