/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author Hype G12
 */

public class PengolahSuhu {
    private double[] suhuHarian;
    
    public static final double NILAI_KOSONG = -1.0;
    
    public PengolahSuhu(double[] suhuHarian){
        this.suhuHarian = suhuHarian;
    }
    
    public void tampilkanData() {
        for (int i = 0; i < this.suhuHarian.length; i++){
            if(this.suhuHarian[i] == NILAI_KOSONG){
                System.out.println("Hari " + (i+1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i+1) + " : " + this.suhuHarian[i] + "°C");
            }
        }
    }
    public int cariIndexKosong(){
        for (int i = 0; i < this.suhuHarian.length; i++){
            if(this.suhuHarian[i] == NILAI_KOSONG){
                return i;
            }
        }
        return -1;
    }
    public void isiDataKosong(){
        int indexKosong = cariIndexKosong();
        
        if (indexKosong != 1 && indexKosong > 0 && indexKosong < this.suhuHarian.length -1){
         double suhuSebelum = this.suhuHarian[indexKosong - 1];
         double suhuSesudah = this.suhuHarian[indexKosong + 1];
         
         this.suhuHarian[indexKosong] = (suhuSebelum + suhuSesudah) / 2.0;
        }
    }
    public double hitungRataRata(){
        double total = 0;
        for(double suhu : this.suhuHarian) {
            total += suhu;
        }
        return total / this.suhuHarian.length;
    }
}
