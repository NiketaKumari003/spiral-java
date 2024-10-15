import java.util.*;

public class Main {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Printing the top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Printing the right boundary
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Printing the bottom boundary (if there are still elements to print)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Printing the left boundary (if there are still elements to print)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}

/* output:-java -cp /tmp/EDoDzioqBT/Main
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

=== Code Execution Successful === */