/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class No7 {
    
    // Fungsi untuk menampilkan array
    static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    // Algoritma Insertion Sort
    static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    // Algoritma Selection Sort
    static void selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0)
                    min_idx = j;

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Algoritma Bubble Sort
    static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap arr[j+1] and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // Array yang akan diurutkan
        String[] arr = {"alndra", "aku", "caca", "bakri", "crace", "muhammad", "pinokio"};

        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        
        // Insertion Sort
        insertionSort(arr);
        System.out.println("\nSetelah diurutkan dengan Insertion Sort:");
        printArray(arr);
        
        // Selection Sort
        selectionSort(arr);
        System.out.println("\nSetelah diurutkan dengan Selection Sort:");
        printArray(arr);
        
        // Bubble Sort
        bubbleSort(arr);
        System.out.println("\nSetelah diurutkan dengan Bubble Sort:");
        printArray(arr);
    }
}

