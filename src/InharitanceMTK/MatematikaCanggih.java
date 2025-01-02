/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InharitanceMTK;

/**
 *
 * @author LENOVO
 */
public class MatematikaCanggih extends MAT{
    
        void tampilanhasil() {
        System.out.println("Hasil penjumlahan : " + pertambahan());
        System.out.println("Hasil perkalian : " + angkaA + " x " + angkaB + " = " + perkalian());
        System.out.println("Hasil modulus : " + angkaA + " % " + angkaB + " = "+ modulus());
    }
}
