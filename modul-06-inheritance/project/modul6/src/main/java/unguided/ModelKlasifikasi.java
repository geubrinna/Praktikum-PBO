package unguided;

public class ModelKlasifikasi extends ModelKomputasi{
    private int jumlahKelas;

    public ModelKlasifikasi(String nama, int jumlahDataLatih, int jumlahKelas){
        super(nama, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    public int getJumlahKelas(){
        return jumalhKelas;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    public double hitungBiaya(){
        return super.hitungBiaya() * jumlahKelas;
    }
}
