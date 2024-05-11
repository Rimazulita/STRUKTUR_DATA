/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class No1 {
   
    public static void main(String[] args) {
        // Array awal
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print array awal
        System.out.print("Array awal: [");
        for (int i = 0 ; i < arr.length -1; i++) {
            System.out.print(arr[i] + ", ");
        }
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.println("]");

        // Print array terbalik
        System.out.print("Array terbalik: [");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        if (arr.length > 0) {
            System.out.print(arr[0]);
        }
        System.out.println("]"); 
    }
}

