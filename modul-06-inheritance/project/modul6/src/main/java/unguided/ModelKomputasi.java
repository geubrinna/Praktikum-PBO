package unguided;

public class ModelKomputasi {
    private String nama;
    private int jumlahDataLatih;

    public ModelKomputasi(String nama, int jumlahDataLatih){
        this.nama = nama;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public int getJumlahDataLatih(){
        return jumlahDataLatih;
    }

    public String getNama(){
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Model: " + nama + " | Data latih: " + jumlahDataLatih);
    }

    public double hitungBiaya(){
        return jumlahDataLatih * 2;
    }

    public double hitungBiaya(int epoch){
        return jumlahDataLatih * epoch;
    }
}

