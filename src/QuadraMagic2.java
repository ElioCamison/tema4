import java.util.Arrays;

public class QuadraMagic2 {

    public static void main(String[] args) {
        imprimeix(5);
    }

    static void imprimeix(int n) {
        int[][] ar = new int[n][n];
        int posI = 0;

        for (int i = 1, contI = 0; i < ar.length; i++, contI++) {
            for (int j = 1, cont = 0; j < ar[i].length; j++,cont++) {
                ar[0][0] = 1;
                ar[i][0] = 1;
                ar[0][i] = 1;

                //sumas
                ar[i][j] = ar[i][cont] + ar[contI][j];
            }
            posI++;
        }
        System.out.print(Arrays.deepToString(ar));
    }

}

