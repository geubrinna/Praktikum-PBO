package unguided;

public class DeepLearning extends ModelKlasifikasi {
    private int jumlahLayer;

    public DeepLearning(String nama, int jumlahDataLatih, int jumlahKelas, int jumlahLayer){
        super(nama, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    public int getJumlahLayer(){
        return jumlahLayer;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah layer: " + jumlahLayer);
    }

    public double hitungBiaya(){
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}
