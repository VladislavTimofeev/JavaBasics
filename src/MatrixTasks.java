import java.util.Arrays;

public class MatrixTasks {

    public static int[][] createMatrixN(int n) {

        /**
         * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
         */
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = n - j;
                }
            }
        }

        return matrix;
    }

    public static void printKRowAndPColumn(int[][] matrix, int k, int p) {
        /**
         * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
         *                   {{1, 2, 3, 4, 5},       1(Matrix[2][0]) 2(Matrix[2][1]) 3(Matrix[2][2]) 4(Matrix[2][3]) 5(Matrix[2][4])
         *                    {6, 7, 8, 9, 8},
         *                    {1, 2, 3, 4, 5},
         *                    {4, 5, 9, 1, 0},       3(Matrix[0][2]) 8(Matrix[1][2]) 3(Matrix[2][2]) 9(Matrix[3][2]) 0 (Matrix[4][2])
         *                    {5, 6, 0, 1, 8}};
         */

        for (int i = 0; i < matrix[k].length; i++) {
            System.out.print(matrix[k][i]);
        }
        System.out.println();

        for (int j = 0; j < matrix.length; j++) {
            System.out.println(matrix[j][p]);
        }

    }

    public static void printElementsOnReverseDiagonalToUp(int[][] matrix) {
        /**
         * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
         *           {{1, 2, 3, 4, 5},    5        matrix.length-1-i - i
         *            {6, 7, 8, 9, 8},    9        matrix.length-1-i - i
         *            {1, 2, 3, 4, 5},    3        matrix.length-1-i - i
         *            {4, 5, 9, 1, 0}     5        matrix.length-1-i - i
         *            {5, 6, 0, 1, 8}};   5        matrix.length-1-i - i
         */

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[matrix.length - 1 - i][i]);
        }

    }

    public static void printElementsOnReverseDiagonal(int[][] matrix) {
        /**
         * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
         *           {{1, 2, 3, 4, 5},  5           i-matrix.length-1 - i
         *            {6, 7, 8, 9, 8},  9           i-matrix.length-1 - i
         *            {1, 2, 3, 4, 5},  3           i-matrix.length-1 - i
         *            {4, 5, 9, 1, 0}   5           i-matrix.length-1 - i
         *            {5, 6, 0, 1, 8}}; 5           i-matrix.length-1 - i
         */

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][matrix.length - 1 - i]);
        }
    }

    public static void printElementsOnDiagonal(int[][] matrix) {
        /**
         * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
         *           {{1, 2, 3, 4, 5},  1
         *            {6, 7, 8, 9, 8},  7
         *            {1, 2, 3, 4, 5},  3
         *            {4, 5, 9, 1, 0}   1
         *            {5, 6, 0, 1, 8}}; 8
         */

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }

    }

    public static void printOddColumnIfFirstElementMoreThanLast(int[][] matrix) {
        /**
         * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
         *                         {{1, 2, 3, 4, 5},
         *                         {6, 7, 8, 9, 8},
         *                         {1, 2, 3, 4, 5},
         *                         {4, 5, 9, 1, 0}};
         */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j % 2 != 0 && matrix[0][j] > matrix[matrix.length - 1][j])
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void printOddStringIfFirstElementMoreThanLast(int[][] matrix) {
        /**
         * 1. Дана матрица. Вывести на экран все нечетные строки, у которых первый элемент больше последнего.
         */
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0 && matrix[i][0] > matrix[i][matrix.length - 1]) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }

    public static void conversation() {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПpeoбpaзoвaниe типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nПpeoбpaзoвaниe типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);

        System.out.println("\nПpeoбpaзoвaниe типа double в тип byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);
    }

    /**
     * Чтобы перевести двоичную систему в десятиричную надо:
     * на места 1 поставить 2 в степени позиции 1(единицы) считая с конца(отсчет с нуля) и все сложить
     *
     * 0000 = 0+0+0+0
     * 0001 = 0+0+0+2^0
     * 0010 = 0+0+2^1+0
     * 0011 = 0+0+2^1+2^0
     * 1101 = 2^3+2^2+0+2^0 = 8+4+1=13
     * 1110 = 2^3+2^2+2^1+0 = 8+4+2=14
     *
     * 101010110 = 2^8+0+2^6+0+2^4+0+2^2+2^1+0= 256 + 64 + 16 + 4 + 2 = 342
     */
}
