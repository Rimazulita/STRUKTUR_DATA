/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.HashMap;

public class No3{
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Membuat objek HashMap untuk menyimpan jumlah kemunculan setiap elemen
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        // Menghitung jumlah kemunculan setiap elemen dalam array
        for (int num : array) {
            if (occurrences.containsKey(num)) {
                // Jika elemen sudah ada dalam HashMap, tambahkan jumlah kemunculannya
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                // Jika elemen belum ada dalam HashMap, tambahkan elemen baru dengan jumlah 1
                occurrences.put(num, 1);
            }
        }

        // Mencetak jumlah kemunculan setiap elemen
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (int key : occurrences.keySet()) {
            System.out.println(key + ": " + occurrences.get(key));
        }
    }
}