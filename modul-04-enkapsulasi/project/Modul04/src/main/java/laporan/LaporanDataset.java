/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laporan;

import model.Dataset;

/**
 *
 * @author Hype G12
 */
public class LaporanDataset {
    public void cetak(Dataset ds){
        String status = ds.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + ds.getNama());
        System.out.println("Jumlah Baris : " + ds.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + ds.getJumlahKolom());
        System.out.printf("Missing      : %d sel (%.2f%%)%n", ds.getJumlahMissing(), ds.getPersentaseMissing());
        System.out.println("Status       : " + status);
        System.out.println();
    }
}
