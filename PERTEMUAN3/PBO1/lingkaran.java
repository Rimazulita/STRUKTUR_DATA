/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/**
 *
 * @author ASUS
 */
public class lingkaran {
    public static void main(String[] args) {
        rumus Ling = new rumus();
        
        Ling.phi = 3.14;
        Ling.jari2 = 20;
        
        Ling.luas = Ling.phi * (Ling.jari2 * Ling.jari2);
        
        System.out.println("phi        = " + Ling.phi);
        System.out.println("jari-jari  = " + Ling.jari2);
        System.out.println("Luas       = " + Ling.luas);
        
    }
}
