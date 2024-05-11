/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class No6 {
 
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mencetak matriks sebelum transposisi
        System.out.println("Matriks sebelum transposisi:");
        printMatrix(matrix);

        // Melakukan transposisi
        transpose(matrix);

        // Mencetak matriks setelah transposisi
        System.out.println("\nMatriks setelah transposisi:");
        printMatrix(matrix);
    }

    // Fungsi untuk melakukan transposisi matriks
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                // Menukar elemen pada posisi (i, j) dengan elemen pada posisi (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Fungsi untuk mencetak matriks
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
