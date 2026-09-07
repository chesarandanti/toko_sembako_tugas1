package com.mycompany.sembako;

public class Toko {
    String namaToko;
    String alamat;
    String pemilik;
    
    public Toko(String namaToko, String alamat, String pemilik){
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.pemilik = pemilik;
    }
    
    public void tampilkanInfo(){
        System.out.println(" Nama Toko  : " + namaToko);
        System.out.println(" Alamat     : " + alamat);
        System.out.println(" Pemilik    : " + pemilik);
        
    }
}