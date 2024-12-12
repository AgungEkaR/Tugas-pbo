public class Sepeda extends Kendaraan {
    private String jenisSepeda;
 
    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }
 
    @Override
    public String displayInfo() {
        return super.displayInfo() + " - Sepeda, Jenis: " + jenisSepeda;
    }
}