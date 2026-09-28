/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guided;

import guided.manusia;

/**
 *
 * @author Hype G12
 */
public class Modul02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*Cara 1 Deklarasi Array*/
        int [] variabelArray1;
        variabelArray1 = new int[5];
        /*Cara 2 Deklarasi Array*/
        int[] variabelArray2 = new int[5];
        /*Cara 3 Deklarasi Array*/
        int[] variabelArray3 = {5, 3, 23, 99, 22, 25};
        
        /*Mengakses Variabel Array*/
        int tampung = variabelArray3[2];
        variabelArray3[5]=65;
        variabelArray3[0] = variabelArray3[5] + variabelArray3[3];
        
        System.out.println("Nilai tampung (variabelArray3[2]) : " + tampung);
        System.out.println("Nilai variabelArray3[2]) : " + variabelArray3[5]);
        System.out.println("Nilai variabelArray3[0]) : " + variabelArray3[0]);
        
        /*Array 2 Dimensi rectangular*/
        double m[][];
        m = new double[4][4];
        m[0][0] = 1;
        m[1][1] = 1;
        m[2][2] = 1;
        m[3][3] = 1;
        
        System.out.println("Array 2 dimensi rectangular : ");
        System.out.println(m[0][0]+" "+m[0][1]+" "+m[0][2]+" "+m[0][3]);
        System.out.println(m[1][0]+" "+m[1][1]+" "+m[1][2]+" "+m[1][3]);
        System.out.println(m[2][0]+" "+m[2][1]+" "+m[2][2]+" "+m[2][3]);
        System.out.println(m[3][0]+" "+m[3][1]+" "+m[3][2]+" "+m[3][3]);
        
        /*Array 2 Dimensi non-rectangular*/
        int twoDim [][] = new int[2][];
        twoDim[0] = new int[2];
        twoDim[1] = new int[3];
        twoDim[0][0] = 1 ;
        twoDim[0][1] = 4 ;
        twoDim[1][0] = 1 ;
        twoDim[1][1] = 4 ;
        twoDim[1][2] = 4 ;
        
        System.out.println("Array 2 dimensi non-rectangular : ");
        System.out.println(twoDim[0][0]);
        System.out.println(twoDim[0][1]);
        System.out.println(twoDim[1][0]);
        System.out.println(twoDim[1][1]);
        System.out.println(twoDim[1][2]);
        
        /*Array Bertipe Objek*/
        manusia [] manusia = new manusia[4];
        for (int i = 0; i < manusia.length; i++) {
        manusia[i] = new manusia();
        }
        manusia[0].setInfo("Hermawan", 180);
        manusia[1].setInfo("Suciati", 160);
        manusia[2].setInfo("Boy", 170);
        manusia[3].setInfo("Neneng", 165);
        manusia[0].info();
        manusia[1].info();
        manusia[2].info();
        manusia[3].info();
        
        /* statement if-else*/
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
        season = "Dingin";
        } else if (month == 3 || month == 4 || month == 5) {
        season = "Semi";
        } else if (month == 6 || month == 7 || month == 8) {
        season = "Panas";
        } else if (month == 9 || month == 10 || month == 11) {
        season = "Gugur";
        } else {
        season = "";
        }
        System.out.println("Bulan April masuk musim " + season + ".");
        
        
        /* statement switch*/
        int hari = 7;
        String hariString;
        switch (hari) {
            case 1: hariString = "Senin";
            break;
            case 2: hariString = "Selasa";
            break;
            case 3: hariString = "Rabu";
            break;
            case 4: hariString = "Kamis";
            break;
            case 5: hariString = "Jumat";
            break;
            case 6: hariString = "Sabtu";
            break;
            case 7: hariString = "Minggu";
            break;
            default: hariString = "Invalid month";
            break;
        }
            System.out.println(hariString);
        
        /*ekspresi bersyarat*/
        int a = 4;
        int b = 5;
        int nilai = 3 > 2 ? a : b;
        System.out.println("nilai = " + nilai);
        
        /* Perulangan */
        int i;
        for(i=1;i<=10;i++){
            System.out.println(Integer.toString(i));
        }
        i=1;
        while(i<=10) {
            System.out.println(Integer.toString(i));
            i++;
        }
        i=1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        }
        while(i<=10);
        
        // 1. Assignment (=) & Aritmatika (+, -, *, /, %)
        int a1 = 10;
        int b1 = 3;
        int jumlah = a1 + b1;
        int sisaBagi = a1 % b1;

        // 2. Increment (++) & Decrement (--)
        a1++;
        b1--;

        // 3. Shortcut Assignment (+=, *=, dll)
        jumlah += 5;

        // 4. Relasional (>, ==, !=, dll) -> menghasilkan boolean
        boolean apakahLebihBesar = a1 > b1;
        boolean apakahSama = a1 == b1;

        // 5. Kondisional / Boolean (&&, ||, !)
        boolean logikaAnd = (a1 > 5) && (b1 < 5);
        boolean logikaNegasi = !apakahSama;

        // Output Hasil
        System.out.println("Aritmatika (10 + 3) : " + (a1 + b1 - 1));
        System.out.println("Sisa Bagi (10 % 3)  : " + sisaBagi);
        System.out.println("Shortcut (13 + 5)   : " + jumlah);
        System.out.println("Relasional (a1 > b1)  : " + apakahLebihBesar);
        System.out.println("Kondisional (&&)    : " + logikaAnd);
        System.out.println("Negasi (!)          : " + logikaNegasi);
    }
}
        


