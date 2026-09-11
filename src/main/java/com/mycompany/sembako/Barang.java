
package com.mycompany.sembako;

public class Barang {
    private String namaBarang;
    private int stok;
    private int harga;
    
    public Barang(String namaBarang, int stok, int harga){
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }
    
    public String getnamaBarang(){
        return namaBarang;
    }
    
    public void setnamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public int getstok(){
        return stok;
    }
    
    public void setstok(int stok){
        this.stok = stok;
    }
    
    public int getharga(){
        return harga;
    }
    
    public void setharga(int harga){
        this.harga = harga;
    }
    public void tampilkanInfo(){
        System.out.println(" Nama Barang  : " + namaBarang);
        System.out.println(" Stok         : " + stok);
        System.out.println(" Harga        : " + harga);
        
    }
}
