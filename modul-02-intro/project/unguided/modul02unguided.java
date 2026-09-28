/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author Hype G12
 */
public class modul02unguided {
    public static void main(String[] args) {
        final double KKM = 75.0;

        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        double[][] nilaiModul = {
            {80.0, 85.0}, 
            {70.0, 65.0}, 
            {90.0, 90.0}  
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < namaMahasiswa.length; i++) {
            double totalNilai = 0.0;

            for (int j = 0; j < nilaiModul[i].length; j++) {
                totalNilai += nilaiModul[i][j];
            }

            double rataRata = totalNilai / nilaiModul[i].length;

            String status = (rataRata >= KKM) ? "LULUS" : "REMEDIAL";

            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2 : " + nilaiModul[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
            System.out.println();
        }
    }
}
