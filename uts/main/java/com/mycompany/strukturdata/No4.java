/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
public class No4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Mengurutkan array agar duplikat berdampingan
        Arrays.sort(array);

        // Menghitung jumlah duplikat untuk mengetahui panjang array baru
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; // Menambahkan 1 untuk elemen terakhir

        // Membuat array baru tanpa duplikat
        int[] result = new int[uniqueCount];
        result[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                result[index++] = array[i];
            }
        }

        // Mencetak array baru tanpa duplikat
        System.out.println("Array tanpa duplikat:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

