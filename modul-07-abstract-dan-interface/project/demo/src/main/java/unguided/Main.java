package unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi (Tidak bisa diinstansiasi langsung, harus dikomentari)
        // TiketBioskop errorTest = new TiketBioskop("Test", 50000, 1);

        // 2. Buka Kasir
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiketReg = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiketVip = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // 4. Array Polimorfik (Menggunakan array statis, bukan ArrayList)
        ItemTransaksi[] keranjangBelanja = { tiketReg, tiketVip, snack };

        // 5. Pemrosesan Dinamis
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;

        for (int i = 0; i < keranjangBelanja.length; i++) {
            keranjangBelanja[i].cetakRincianItem();
            grandTotal += keranjangBelanja[i].getNominalBayar();
        }

        // 6. Tutup Kasir & Cetak Grand Total
        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}