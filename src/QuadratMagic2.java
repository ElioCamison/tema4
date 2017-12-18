import java.util.Arrays;

public class QuadratMagic2 {

    private int dimension;

    public QuadratMagic2(int i) {
    }


    static void imprimeix(int n) {
        int[][] ar = new int[n][n];

        for (int i = 1, contI = 0; i < ar.length; i++, contI++) {
            for (int j = 1, cont = 0; j < ar[i].length; j++,cont++) {
                ar[0][0] = 1;
                ar[i][0] = 1;
                ar[0][i] = 1;

                //sumas
                ar[i][j] = ar[i][cont] + ar[contI][j];
            }
        }
        System.out.print(Arrays.deepToString(ar));
    }

}

