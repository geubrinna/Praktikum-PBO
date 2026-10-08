/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hype G12
 */
public class Dataset {
    //Atribut private
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;
    
    //Class variable
    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;
    
    //1.Co structor tanpa parameter
    public Dataset(){
        this.nama = " ";
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }
    
    //2.Constructor dengan 1 parameter
    public Dataset(String nama){
        this.nama = "";
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }
    
    //3. Constructor lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing){
        this.nama = nama;
        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
        totalDataset++;
    }
    
    //Static method untuk mendapatkan total dataset yang dibuat
    public static int getTotalDataset(){
        return totalDataset;
    }
    
    //Getter & Setter
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getJumlahBaris(){
        return jumlahBaris;
    }
    
    public void setJumlahBaris(int jumlahBaris){
        if(jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }
    
    public int getJumlahKolom(){
        return jumlahKolom;
    }
    
    public void setJumlahKolom(int jumlahKolom){
        if(jumlahKolom >= 0){
            this.jumlahKolom = jumlahKolom;
        }
    }
    
    public int getJumlahMissing(){
        return jumlahMissing;
    }
    
    public void setJumlahMissing(int jumlahMissing){
        if(jumlahMissing >= 0){
            this.jumlahMissing = jumlahMissing;
        }
    }
    
    public double getPersentaseMissing(){
        int totalSel = jumlahBaris * jumlahKolom;
        if(totalSel == 0){
            return 0.0;
        }
        return ((double) jumlahMissing/totalSel) * 100.0;
    }
    
    public boolean perluDibersihkan(){
        return getPersentaseMissing() > BATAS_MISSING;
    }
            
            
}
