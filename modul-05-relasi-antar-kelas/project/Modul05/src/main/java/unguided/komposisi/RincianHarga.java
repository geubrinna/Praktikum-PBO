package unguided.komposisi;

public class RincianHarga {
    private double hargaDasar;
    private double pajak;

    //Construdstor
    public RincianHarga(double hargaDasar){
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * 0.10;
    }

    public double getHargaTotal(){
        return this.hargaDasar + this.pajak;
    }

    //Getter
    public double getHargaDasar(){
        return this.hargaDasar;
    }

    public double getPajak(){
        return this.pajak;
    }
}
