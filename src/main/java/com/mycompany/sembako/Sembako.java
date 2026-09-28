package com.mycompany.sembako;

public class Sembako {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    MANAJEMEN TOKO SEMBAKO CHESAK    ");
        System.out.println("========================================");
        
        Toko tokoSaya = new Toko(
                "Toko Adipura",
                "Karang Asem",
                "Chesuy"
        );
        
        tokoSaya.tampilkanInfo();
        
        System.out.println();
        
        Barang barang1 = new Barang(
                "Beras",
                50,
                17000
        );
        
        BarangKadaluarsa barang2 = new BarangKadaluarsa(
                "Tepung Terigu",
                50,
                14000,
                "25-12-2026"
        ); 
        
        System.out.println("===== DATA BARANG YANG DI CHECK OUT ====");
        
        barang1.tampilkanInfo();
        System.out.println();
        
        barang2.tampilkanInfo();
    }
}