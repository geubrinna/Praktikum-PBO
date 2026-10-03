/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author Hype G12
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        
        double[] suhuHarian = {30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9};
        
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);
        
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        
        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);
        System.out.println();
        
        pengolah.isiDataKosong();;
        
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        
        System.out.printf("Rata-rata : %.2f°C\n\n", pengolah.hitungRataRata());
        
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        
        System.out.println("{ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}
