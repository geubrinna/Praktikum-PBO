package unguided.asosiasi;

import unguided.agregasi.Pesanan;
import unguided.komposisi.Produk;

public class Kasir {
    private String namaKasir;

    //Constructor
    public Kasir(String namaKasir){
        this.namaKasir = namaKasir;
    }

    public void prosesPembayaran(Pesanan pesanan){
        double totalSubtotal = 0;
        double totalPajak = 0;
        Produk[] produk = pesanan.getDaftarProduk();
        int jumlah = pesanan.getJumlahProduk();

        for(int i = 0; i < jumlah; i++){
            totalSubtotal += produk[i].getRincian().getHargaDasar();
            totalPajak += produk[i].getRincian().getPajak();
        }

        double totalBayar = totalSubtotal + totalPajak;

        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        :  Meja" + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    :  " + jumlah);
        System.out.println("Total Subtotal : Rp" + totalSubtotal);
        System.out.println("Total Pajak    : Rp" + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp" + totalBayar);
        System.out.println("=================================");

    }

    public String getNamaKasir() {
        return this.namaKasir;
    }

}
