package unguided;

public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();

    // Tugas 3: Default Method
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Tugas 3: Static Method
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}