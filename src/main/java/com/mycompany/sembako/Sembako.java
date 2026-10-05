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
        
        // Penerapan Polimorfisme: Array bertipe 'Barang' menampung berbagai objek turunan
        Barang[] daftarBarang = new Barang[2];
        daftarBarang[0] = new NonKadaluarsa("Beras", 50, 17000);
        daftarBarang[1] = new BarangKadaluarsa("Tepung Terigu", 50, 14000, "25-12-2026");
        
        System.out.println("===== DATA BARANG YANG DI CHECK OUT ====");
        
        // Pemanggilan method tampilkanInfo() akan menyesuaikan bentuk objek aslinya
        for (Barang b : daftarBarang) {
            b.tampilkanInfo();
            System.out.println("----------------------------------------");
        }
    }
}