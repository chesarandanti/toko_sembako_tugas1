
package com.mycompany.sembako;

public class Barang {
    String namaBarang;
    int stok;
    int harga;
    
    public Barang(String namaBarang, int stok, int harga){
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }
    
    public void tampilkanInfo(){
        System.out.println(" Nama Barang  : " + namaBarang);
        System.out.println(" Stok         : " + stok);
        System.out.println(" Harga        : " + harga);
    }
}
