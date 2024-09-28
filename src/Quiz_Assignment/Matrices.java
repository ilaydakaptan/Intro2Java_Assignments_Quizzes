// İLAYDA KAPTAN 
// 200101023

package Quiz_Assignment;

public class Matrices {

    // Matrisi transpoze eden metot
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
    
    // Matrisi belirli bir sayıyla çarpan metot
    public static int[][] multiplyMatrixByNumber(int[][] matrix, int number) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix[i][j] * number;
            }
        }

        return resultMatrix;
    }

    // İki matrisi çıkaran metot
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return resultMatrix;
    }
    
    // Matrisi yazdıran metot
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int[][] matrix_D = {
                {1, 5, 2},
                {-1, 0, 1},
                {3, 2, 4}
        };

        int[][] matrix_E = {
                {6, 1, 3},
                {-1, 1, 2},
                {4, 1, 3}
        };

        int[][] matrix_E_transposed = transpose(matrix_E);

        int[][] matrix_2E_transposed = multiplyMatrixByNumber(matrix_E_transposed, 2);
        
        int[][] matrix_D_transposed = transpose(matrix_D);

        int[][] matrix_3D_transposed = multiplyMatrixByNumber(matrix_D_transposed, 3);
        
        int[][] matrix_2ET_minus_3DT = subtractMatrices(matrix_2E_transposed, matrix_3D_transposed);
        
        int[][] final_transpose = transpose(matrix_2ET_minus_3DT);
                
        // Original matrisleri yazdır
        System.out.println("Matrix D:");
        printMatrix(matrix_D);
        
        System.out.println("\nMatrix D:");
        printMatrix(matrix_E);
        
        // Sonuç matrisini yazdır
        System.out.println("\nResult Matrix:");
        printMatrix(final_transpose);
    }
}
