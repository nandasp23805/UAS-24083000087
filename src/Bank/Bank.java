/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author LENOVO
 */
public class Bank {
    int saldo;
    
    public Bank(int saldo){
        this.saldo = saldo;

    }
    void getSaldo(){
        System.out.println("welcome to Bank Mandiri");
        System.out.println("------------------------------");
        System.out.println("saldo anda saat ini Rp" + saldo);
        
    }
    void simpanUang (int simpan){
        saldo = saldo + simpan;
        System.out.println("simpan uang " + simpan);
        System.out.println("saldo saat ini = Rp" + saldo);
        
    }
    void ambilUang(int ambil){
        if (saldo >= ambil) {
            saldo = saldo -=ambil;
            System.out.println("ambil uang " + ambil);
            System.out.println("saldo saat ini = Rp" + saldo);
            
        }
        else { 
            System.out.println("saldo anda kurang... astagfirullah... ");
        }
    }
}
