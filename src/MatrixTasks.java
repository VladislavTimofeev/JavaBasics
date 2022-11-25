import java.util.Arrays;

public class MatrixTasks {

    public static void createMatrixByZeroAndOne(int m, int n) {
        /**
         * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
         * единиц равно номеру столбца.
         *
         */
        int[][] arrays = new int[m][n];
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (j >= count) {
                    arrays[i][j] = 1;
                    count++;
                } else {
                    arrays[i][j] = 0;
                }
            }
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print(arrays[i][j] + " ");
//            }
//            System.out.println();
        }

//        int[][] arrays = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (i >= count) {
//                    arrays[i][j] = 1;
//                    count++;
//                } else {
//                    arrays[i][j] = 0;
//                }
//            }
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print(arrays[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

    public static void findNumberLine(int[][] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            int count = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Номер строки, в торой 5 встречается 3 и более раз : " + (++i));
            }
        }
    }

    public static int[][] createRandomMatrix() {
        /**
         * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
         * которых число 5 встречается три и более раз.
         *
         * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу
         * номера строк, в которых число 5 встречается три и более раз.
         */

        int[][] arrays = new int[10][20];
        int a = 0;
        int b = 15;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = ((int) (Math.random() * b));
            }
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        return arrays;
    }


    public static void findPositiveElementsMainDiagonal(int[][] arrays) {
        /**
         * Найти положительные элементы главной диагонали квадратной матрицы.
         */

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][i] > 0)
                System.out.println(arrays[i][i]);
        }
    }


    public static void findMaxSumInColumn(int[][] arrays) {

        /**
         * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
         * столбец содержит максимальную сумму.
         *                        {{1, 2, 3, 4, 5},
         *                         {6, 7, 8, 9, 8},
         *                         {1, 2, 3, 4, 5},
         *                         {4, 5, 9, 1, 0},
         *                         {5, 6, 0, 1, 8}};
         * Найти сумму элементов в каждом столбце
         * Найти макс сумму среди столбцов
         * matrix[0][0]      matrix[0][1]
         * matrix[1][0]      matrix[1][1]
         * matrix[2][0]      matrix[2][1]
         * matrix[3][0]      matrix[3][1]
         * matrix[4][0]      matrix[4][1]
         */

        int[] sumColumn = new int[arrays.length];
        int index = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                int sum = Math.abs(arrays[j][i]);
                sumColumn[i] += sum;
            }
        }
        for (int i = 0; i < sumColumn.length; i++) {
            System.out.println("Сумма элементов столбца " + (i + 1) + " : " + sumColumn[i]);
        }
        int max = 0;
        for (int i = 0; i < sumColumn.length; i++) {
            if (sumColumn[i] > max)
                max = sumColumn[i];
        }
        System.out.println("MAX: " + max);
    }

    public static void replaceColumnsInMatrix(int[][] matrix, int columnOne, int columnTwo) {
        /**
         * В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
         * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
         * пользователь с клавиатуры.
         *                        {{1, 2, 3, 4, 5}, после выполнения программы            2 1 3 4 5
         *                         {6, 7, 8, 9, 8}, матрица должна иметь след вид ---     7 6 8 9 8
         *                         {1, 2, 3, 4, 5},                                       2 1 3 4 5
         *                         {4, 5, 9, 1, 0},                                       5 4 9 1 0
         *                         {5, 6, 0, 1, 8}};                                      6 5 0 1 8
         *   matrix[0][columnOne] = 1   -   matrix[0][columnTwo] = 2
         *   matrix[1][columnOne] = 6   -   matrix[1][columnTwo] = 7
         *   matrix[2][columnOne] = 1   -   matrix[2][columnTwo] = 2
         *   matrix[3][columnOne] = 4   -   matrix[3][columnTwo] = 5
         *   matrix[4][columnOne] = 5   -   matrix[4][columnTwo] = 6
         *
         *   int temp = matrix[i][columnOne];
         *   matrix[i][columnOne] = matrix[i][columnTwo];
         *   matrix[i][columnTwo] = temp;
         *
         */

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][columnOne];
            matrix[i][columnOne] = matrix[i][columnTwo];
            matrix[i][columnTwo] = temp;
        }
    }


    public static int[][] createMatrixBySecondCondition(int n) {
        /**
         * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
         *
         * 1 1 1 1 1 1
         * 0 1 1 1 1 0
         * 0 0 1 1 0 0
         * 0 0 1 1 0 0
         * 0 1 1 1 1 0
         * 1 1 1 1 1 1
         *
         */
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                matrix[i][j] = 1;
                matrix[matrix.length - i - 1][j] = 1;
            }
        }
        return matrix;

    }

    public static int[][] createMatrixByCondition(int n) {
        /**
         * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
         *
         * 1 1 1 1 1 1
         * 2 2 2 2 2 0
         * 3 3 3 3 0 0
         * 4 4 4 0 0 0
         * 5 5 0 0 0 0
         * 6 0 0 0 0 0
         */
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        return matrix;
    }

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
         * Дана матрица. Вывести на экран все нечетные строки, у которых первый элемент больше последнего.
         */
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0 && matrix[i][0] > matrix[i][matrix.length - 1]) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }
}

