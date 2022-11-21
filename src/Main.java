import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 1};
        double[] arrayList = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double[] array1 = {-5.6, 4.5, 0, -4.7, -3.2, -1.4, 0, 1.3, 4.7, 7.7, 9.9, 0.5};

        int[][] matrix =
                {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 8},
                        {1, 2, 3, 4, 5},
                        {4, 5, 9, 1, 0},
                        {5, 6, 0, 1, 8}};

        int[][] myMatrix = MatrixTasks.createMatrixN(8);
        for (int[] v : myMatrix) {
            System.out.println(Arrays.toString(v));
        }
        //MatrixTasks.printKRowAndPColumn(matrix,2,2);
        //MatrixTasks.printElementsOnReverseDiagonalToUp(matrix);
        //MatrixTasks.printElementsOnReverseDiagonal(matrix);
        //MatrixTasks.printElementsOnDiagonal(matrix);
        //MatrixTasks.conversation();
        //MatrixTasks.printOddColumnIfFirstElementMoreThanLast(matrix);

        //Algorithmization.findSumElementsMultiplesK(array, 4);
        //Algorithmization.replaceElementsWithGivenNumberAndCountReplacements(arrayList, 5);
        //Algorithmization.countNegativePositiveZeroElements(array);
        //Algorithmization.changePlaceMinAndMaxElements(array);
        //Algorithmization.pyramid(7);
        //Algorithmization.reversPyramid(7);
        //Algorithmization.fullPyramid(4);
        //Algorithmization.upSideDownPyramid(7);
        //Algorithmization.sandClock(6);
        //Algorithmization.rhombus(8);
        //Algorithmization.pyramidOnTheRightSide(7);
        //Algorithmization.printResult(array);
        //Algorithmization.findSumIfIndexIsPrimeNumber(arrayList);
    }
}
