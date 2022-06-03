package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            int[] rowInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < size; col++) {
               matrix[row]=rowInput;
            }
        }
        int mainDiagSum = 0;
        for (int counter = 0; counter < size; counter++) {
            mainDiagSum+=matrix[counter][counter];
        }
        int secondDiagSum=0;
        for (int row = 0, col = size-1 ;row <size && col>=0; row++,col--) {
            secondDiagSum+=matrix[row][col];
        }
        int dif = Math.abs(mainDiagSum-secondDiagSum);
        System.out.println(dif);
    }
}
