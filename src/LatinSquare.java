

public class LatinSquare {


    public static int targetCheckSum1(int rowSize) {
        int sum=0;
        for (int i = 1; i <= rowSize; i++){
            sum+=i;
        }
        return sum;
    }


    public static int targetCheckSum2(int rowSize) {
        int prod = 1;
        for (int i = 1; i <= rowSize; i++) {
            prod *= i;
        }
        return prod;
    }


    public static boolean isLatinRows(int[][] array2d, int checkSum1, int checkSum2) {

        int n = array2d.length;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int rowProd = 1;
            for (int j = 0; j < n; j++) {
                rowSum += array2d[i][j];
                rowProd *= array2d[i][j];
            }
            if (rowSum != checkSum1 || rowProd != checkSum2) {
                return false;
            }
        }
        return true;
    }



    public static boolean isLatinColumns(int[][] array2d, int checkSum1, int checkSum2) {
        {

            int n = array2d.length;
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                int colProd = 1;
                for (int i = 0; i < n; i++) {
                    colSum += array2d[i][j];
                    colProd *= array2d[i][j];
                }
                if (colSum != checkSum1 || colProd != checkSum2) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isLatinSquare(int[][] array2d) {
        int n = array2d.length;
        int checkSum1 = targetCheckSum1(n);
        int checkSum2 = targetCheckSum2(n);
        return isLatinRows(array2d, checkSum1, checkSum2) && isLatinColumns(array2d, checkSum1, checkSum2);
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
