/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
    
    public static void main(String[] args) {
        Bank bankku = new Bank(1000000);
        bankku.getSaldo();
        bankku.simpanUang(200000);
        bankku.ambilUang(500000);
    }
}
