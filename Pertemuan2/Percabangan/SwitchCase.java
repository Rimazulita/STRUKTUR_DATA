package Percabangan;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int namaMhs;
        System.out.print("Masukkan Pilihan(1-4) : ");
        namaMhs = input.nextInt();
        System.out.println("Pilihan Anda : "+namaMhs);
        switch(namaMhs){
        case 1 :
            System.out.println("Muhammad Chiko");
            break;
        case 2 : 
            System.out.println("Meylia Salma Nabila");
            break;
        case 3 :
            System.out.println("Mufida Khoirina");
            break;
        case 4 :
            System.out.println("Azizah Nur Indah");
        default :
            System.out.println("Maaf Coba Lagi");
        }
    }
}
