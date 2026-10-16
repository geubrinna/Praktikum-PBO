package unguided;

import unguided.asosiasi.Kasir;
import unguided.komposisi.Produk;
import unguided.agregasi.Pesanan;

public class main {
    public static void main(String[] args){
        Kasir kasir = new Kasir("Budi");

        Produk produk1 = new Produk("Iced Americano", 18000);
        Produk produk2 = new Produk("Beef Croissant", 25000);
        Produk produk3 = new Produk("Matcha Latte", 22000);

        Pesanan pesananMeja4 = new Pesanan(4 ,5);

        pesananMeja4.tambahProduk(produk1);
        pesananMeja4.tambahProduk(produk2);
        pesananMeja4.tambahProduk(produk3);

        pesananMeja4.tampilkanPesanan();

        kasir.prosesPembayaran(pesananMeja4);
        
    }
}
