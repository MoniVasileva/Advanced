package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int [][] matrix = new int[rows][cols];
int [][]result = new int[2][2];

        for (int row = 0; row < rows; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols-1; col++) {
                int currSum = matrix[row][col]
                        +matrix[row][col+1]
                        +matrix[row+1][col]
                        +matrix[row+1][col+1];

                if (maxSum<currSum){
                    maxSum=currSum;
                    result = new int[][]{
                            {matrix[row][col],matrix[row][col+1]},
                            {matrix[row+1][col],matrix[row+1][col+1]}
                    };
                }
            }
        }


       printMatrix(result);
        System.out.println(maxSum);
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }

}
