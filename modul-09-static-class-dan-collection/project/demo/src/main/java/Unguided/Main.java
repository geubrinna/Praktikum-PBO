package Unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menyimpan data ke dalam List menggunakan Generics
        List<ModelEksperimen> daftarModel = new ArrayList<>();
        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        // 1. Menampilkan jumlah eksperimen menggunakan static method
        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());

        // 2. Mengurutkan berdasarkan akurasi tertinggi (Comparable)
        System.out.println("\nSorted by akurasi");
        Collections.sort(daftarModel);
        daftarModel.forEach(System.out::println);

        // 3. Mengurutkan berdasarkan waktu training tercepat (Comparator)
        System.out.println("\nSorted by waktu training");
        Collections.sort(daftarModel, new WaktuTrainingComparator());
        daftarModel.forEach(System.out::println);

        // 4. Filtering model dengan akurasi minimal 0.85 menggunakan ekspresi lambda
        System.out.println("\nModel dengan akurasi minimal 0.85");
        daftarModel.stream()
                   .filter(model -> model.getAkurasi() >= 0.85)
                   .forEach(System.out::println);

        // 5. Pencarian model dengan nama "KNN" menggunakan ekspresi lambda
        System.out.println("\nPencarian model KNN");
        ModelEksperimen hasilCari = daftarModel.stream()
                                              .filter(model -> model.getNamaModel().equals("KNN"))
                                              .findFirst()
                                              .orElse(null);
        System.out.println(hasilCari);
    }
}
