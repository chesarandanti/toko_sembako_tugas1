/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.sembako;


public class NonKadaluarsa extends Barang {

    public NonKadaluarsa(String namaBarang, int stok, int harga) {
        super(namaBarang, stok, harga);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(" Nama Barang  : " + getnamaBarang());
        System.out.println(" Stok         : " + getstok());
        System.out.println(" Harga        : " + getharga());
        System.out.println(" Kategori     : Non-Kadaluarsa");
    }
}
