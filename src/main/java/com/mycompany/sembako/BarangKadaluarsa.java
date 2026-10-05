/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sembako;

public class BarangKadaluarsa extends Barang {
    private String tanggalKadaluarsa;

    public BarangKadaluarsa(String namaBarang, int stok, int harga, String tanggalKadaluarsa) {
        super(namaBarang, stok, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(" Nama Barang  : " + getnamaBarang());
        System.out.println(" Stok         : " + getstok());
        System.out.println(" Harga        : " + getharga());
        System.out.println(" Expired Date : " + tanggalKadaluarsa);
    }
}
   
