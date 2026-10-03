/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided.keyword;

/**
 *
 * @author Hype G12
 */
public class lagu {
    private String pencipta;
    private String judul;
    public void isiparam(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }
    public void cetakKeLayar() {
        if(judul == null&& pencipta==null) return;
        System.out.println("Judul : " + judul + ", Pencipta : " + pencipta);
    }
}

