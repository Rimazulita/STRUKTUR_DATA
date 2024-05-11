/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class No5 {
  
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}};

        boolean isIdentityMatrix = true;

        // Mengecek apakah diagonal utama mengandung semua 1
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != 1) {
                isIdentityMatrix = false;
                break;
            }
        }

        // Mengecek apakah elemen di luar diagonal utama mengandung semua 0
        if (isIdentityMatrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i != j && matrix[i][j] != 0) {
                        isIdentityMatrix = false;
                        break;
                    }
                }
            }
        }

        // Mencetak hasil
        if (isIdentityMatrix) {
            System.out.println("Matriks ini adalah matriks identitas.");
        } else {
            System.out.println("Matriks ini bukan matriks identitas.");
        }
    }
}

