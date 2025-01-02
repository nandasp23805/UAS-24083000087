/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MTKOVER;

/**
 *
 * @author LENOVO
 */
public class mtkoverberaksi {

    public static void main(String[] args) {
        mtkovercanggih MTKOVER = new mtkovercanggih();
        System.out.println("Overloading pertambahan");
        MTKOVER.pertambahan(12.5, 28.7, 14.2);
        MTKOVER.pertambahan(12, 28, 14);
        MTKOVER.pertambahan(23,24);
        MTKOVER.pertambahan(3.4 , 4.9);
        
        System.out.println("\nOverloading pengurangan");
        MTKOVER.pengurangan(12.5, 28.7, 14.2);
        MTKOVER.pengurangan(12, 28, 14);
        MTKOVER.pengurangan(23,24);
        MTKOVER.pengurangan(3.4 , 4.9);
        
        System.out.println("\nOverloading perkalian");
        MTKOVER.perkalian(12.5, 28.7, 14.2);
        MTKOVER.perkalian(12, 28, 14);
        MTKOVER.perkalian(23,24);
        MTKOVER.perkalian(3.4 , 4.9);
        
        System.out.println("\nOverloading pembagian");
        MTKOVER.pembagian(12.5, 28.7, 14.2);
        MTKOVER.pembagian(12, 28, 14);
        MTKOVER.pembagian(23,24);
        MTKOVER.pembagian(3.4 , 4.9);
        
        System.out.println("\nOverloading modulus");
        MTKOVER.modulus(12.5, 28.7, 14.2);
        MTKOVER.modulus(12, 28, 14);
        MTKOVER.modulus(23,24);
        MTKOVER.modulus(3.4 , 4.9);
    }
}
