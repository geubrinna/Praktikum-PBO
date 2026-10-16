package unguided.komposisi;

public class Produk {
    private String namaProduk;
    private RincianHarga rincian;

    //constructor
    public Produk(String namaProduk, double hargaDasar){
        this.namaProduk = namaProduk;
        this.rincian = new RincianHarga(hargaDasar);
    }

    //Getter
    public String getNamaProduk(){
        return this.namaProduk;
    }

    public RincianHarga getRincian(){
        return this.rincian;
    }
}
