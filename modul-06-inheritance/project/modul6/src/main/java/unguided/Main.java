package unguided;

public class Main {
    public static void main(String[] args){

        ModelKomputasi[] daftarModel = new ModelKomputasi[3];
        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new DeepLearning("Neural Network", 1000, 5, 3);

        double totalBiaya = 0;

        for (ModelKomputasi model : daftarModel) {
            model.tampilkanInfo();
            double biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + (int) biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + (int) totalBiaya);

        double biaya10EpochNN = daftarModel[2].hitungBiaya(10);
        System.out.println("Biaya 10 epoch (Neural Network): " + (int) biaya10EpochNN);

        double biaya10EpochRegresi = daftarModel[0].hitungBiaya(10);
        System.out.println("Biaya 10 epoch (Regresi Linier): " + (int) biaya10EpochRegresi);

        double biayaBatchRegresi = ((ModelRegresi) daftarModel[0]).hitungBiaya(10, 50);
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + (int) biayaBatchRegresi);
       
    }
}


