import java.util.Arrays;

public class QuadratMagic {

    public QuadratMagic(int i) {
    }


    static void imprimeix(int n) {
        int[][] ar = new int[n][n];

        for (int i = 0; i < ar.length; i++) {
            ar[0][0]=1;
            ar[i][0]=1;
            ar[0][i]=1;
        }

        for (int i = 1, contI = 0; i < ar.length; i++, contI++) {
            for (int j = 1, cont = 0; j < ar[i].length; j++,cont++) {
                //sumas
                ar[i][j] = ar[i][cont] + ar[contI][j];
            }
        }
        System.out.print(Arrays.deepToString(ar));
    }

}

