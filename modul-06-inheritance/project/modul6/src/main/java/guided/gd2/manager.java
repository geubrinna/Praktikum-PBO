package guided.gd2;

public class manager extends employee {
  private String alamat;
  
  public manager(String nama, String alamat){
    super(nama);
    this.alamat = alamat;
  }

  public void tampilInformasi(){
    super.tampilNama();
    System.out.println("Alamat: " + alamat);
    System.out.println("Departemen: " + super.departemen);
  }
}
