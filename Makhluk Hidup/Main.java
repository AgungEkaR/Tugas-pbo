public class Main {
  public static void main(String[] args) {
      MakhlukHidup manusia = new Manusia();
      MakhlukHidup hewan = new Hewan();
      MakhlukHidup tumbuhan = new Tumbuhan();
     
      System.out.println("Manusia");
      manusia.bernapas();
      manusia.berkembangBiak();
      manusia.makan();
 
      System.out.println("\nHewan");
      hewan.bernapas();
      hewan.berkembangBiak();
      hewan.makan();
 
      System.out.println("\nTumbuhan");
      tumbuhan.bernapas();
      tumbuhan.berkembangBiak();
      tumbuhan.makan();
  }
}
