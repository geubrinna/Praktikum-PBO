package unguided.agregasi;

import unguided.komposisi.Produk;

public class Pesanan {
    private int nomorMeja;
    private Produk[] daftarProduk;
    private int jumlahProduk;

    //Constructor
    public Pesanan(int nomorMeja, int kapasitasMax){
        this.nomorMeja = nomorMeja;
        this.daftarProduk = new Produk[kapasitasMax];
        this.jumlahProduk = 0;
    }

    public void tambahProduk(Produk produk){
        if (jumlahProduk < daftarProduk.length){
            daftarProduk[jumlahProduk] = produk;
            jumlahProduk++;
        } else {
            System.out.println("Kapasistas pesanan meja" + nomorMeja + " sudah penuh!");
        }
    }

    public void tampilkanPesanan(){
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja : " + this.nomorMeja);
        for (int i = 0; i < this.jumlahProduk; i++){
            Produk produk = this.daftarProduk[i];
            double totalHarga = produk.getRincian().getHargaTotal();
            double hargaDasar = produk.getRincian().getHargaDasar();
            double pajak = produk.getRincian().getPajak();

            System.out.println((i+1) + ". " + produk.getNamaProduk() + " - Rp" + totalHarga + " (Harga: " + hargaDasar + ", Pajak: " + pajak + ")");
        }
        System.out.println();
    }
    //Getter 
    public int getNomorMeja(){
        return this.nomorMeja;
    }

    public Produk[] getDaftarProduk() {
        return this.daftarProduk;
    }

    public int getJumlahProduk(){
        return this.jumlahProduk;
    }
}
