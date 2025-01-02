/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author LENOVO
 */
public class MobilBeraksi {
    
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        mobilku.warna = "biru";
        mobilku.tahunProduksi = 2019;
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
    }
}
