import java.util.Arrays;

public class QuadratMagic {

    public static void main(String[] args) {
        imprimeix(6);
    }

    static void imprimeix(int n){
       int[][] ar = new int[n][n];
       int posJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                posJ++;
                ar[i][0] = 1;
                ar[0][i] = 1;

                //sumas
                ar[1][1] = ar[1][0] + ar[0][1];
                ar[1][2] = ar[1][1] + ar[0][2];
                ar[1][3] = ar[1][2] + ar[0][3];
                ar[1][4] = ar[1][3] + ar[0][4];
                ar[1][5] = ar[1][4] + ar[0][5];

                ar[2][1] = ar[2][0] + ar[1][1];
                ar[2][2] = ar[2][1] + ar[1][2];
                ar[2][3] = ar[2][2] + ar[1][3];
                ar[2][4] = ar[2][3] + ar[1][4];
                ar[2][5] = ar[2][4] + ar[1][5];

                ar[3][1] = ar[3][0] + ar[2][1];
                ar[3][2] = ar[3][1] + ar[2][2];
                ar[3][3] = ar[3][2] + ar[2][3];
                ar[3][4] = ar[3][3] + ar[2][4];
                ar[3][5] = ar[3][4] + ar[2][5];

                ar[4][1] = ar[4][0] + ar[3][1];







            }
        }
        System.out.print(Arrays.deepToString(ar));
    }

}
