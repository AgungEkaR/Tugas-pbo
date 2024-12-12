public class Main {
    public static void main(String[] args) {
        Rental rentalSystem = new Rental();
 
        Kendaraan mobil1 = new Mobil("Toyota", "Avanza", 2020, 4);
        Kendaraan motor1 = new Motor("Honda", "Vario", 2022, 2);
        Kendaraan sepeda1 = new Sepeda("Polygon", "Helios A", 2019, "Balap");
 
        rentalSystem.tambahKendaraan(mobil1);
        rentalSystem.tambahKendaraan(motor1);
        rentalSystem.tambahKendaraan(sepeda1);
 
        rentalSystem.tampilkanKendaraan();
 
        rentalSystem.tambahPenyewa("eka1", mobil1);
        rentalSystem.tambahPenyewa("eka2", sepeda1);
 
        rentalSystem.tampilkanPenyewa();
    }
}