/**
 * Return the max value in a matrix.
 */

public class MatMax {

    public static int matMax(int[][] mat) {
        return matMax(mat, 0, 0);
    }

    public static int matMax(int[][] mat, int i, int j) {

        if (i == mat.length - 1 && j == mat[i].length - 1) 
            return mat[i][j];
        
        if (j == mat[i].length - 1) 
            return Math.max(mat[i][j], matMax(mat, i + 1, 0));
        return Math.max(mat[i][j], matMax(mat, i, j + 1));
    }
}
