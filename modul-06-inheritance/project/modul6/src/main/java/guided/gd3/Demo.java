package guided.gd3;

public class Demo {
    public static void main(String[] args) {
        lagu d,a;
        d = new lagu();
        a = new lagu();

        d.isiParam("Lagu 1");
        a.isiParam("Lagu 2", "aku");

        d.tampilkan();
        a.tampilkan();
    }
}
