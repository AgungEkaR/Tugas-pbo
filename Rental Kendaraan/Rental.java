import java.util.ArrayList;
import java.util.List;
 
public class Rental {
    private List<Kendaraan> kendaraanList = new ArrayList<>();
    private List<Penyewa> penyewaList = new ArrayList<>();
 
    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }
 
    public void tampilkanKendaraan() {
        System.out.println("Daftar Kendaraan Tersedia:");
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan.displayInfo());
        }
    }
 
    public void tambahPenyewa(String nama, Kendaraan kendaraan) {
        penyewaList.add(new Penyewa(nama, kendaraan));
    }
 
    public void tampilkanPenyewa() {
        System.out.println("\nDaftar Penyewa dan Kendaraan yang Disewa:");
        for (Penyewa penyewa : penyewaList) {
            System.out.println(penyewa.displayInfo());
        }
    }
}