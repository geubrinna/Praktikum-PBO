

import guided.agregrasi.*;
import guided.komposisi.*;

public class main {
    public static void main(String[] args){
        runGuidedAgregrasi();
        runGuidedKomposisi();
    }
    
    public static void runGuidedAgregrasi(){
        Mahasiswa m1 = new Mahasiswa("103112400148", "Rendhi");
        Mahasiswa m2 = new Mahasiswa("103112400149", "John");

        Jurusan prodi = new Jurusan("SD","Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();


    }
    
    public static void runGuidedKomposisi(){
        Komputer pc = new Komputer("Intel Core i5",3200,"LG 24 Inch","Logitech","Wireless");
        pc.displaySpecKomputer();
    }
}

