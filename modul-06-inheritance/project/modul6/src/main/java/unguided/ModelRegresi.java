package unguided;

public class ModelRegresi extends ModelKomputasi{
    private int jumlahFitur;

    public ModelRegresi(String nama, int jumlahDataLatih, int jumlahFitur){
        super(nama, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    public int getJumlahFitur(){
        return jumlahFitur;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    public double hitungBiaya(){
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public double hitungBiaya(int epoch, int ukuranBatch){
        return (double) (getJumlahDataLatih() * epoch) /ukuranBatch;
    }
}
