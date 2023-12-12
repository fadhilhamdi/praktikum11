import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class hitungTotalBayar  extends pelanggan{
  public Integer kodeBarang;
   public String namabarang;
   public Integer hargabarang;
   public Integer jumlahbeli;
   public Integer totalBayar;  
   public String kasir;

   public hitungTotalBayar(String nama, String alamat, String namabarang, String kasir, Integer hargabarang, 
     Integer jumlahbeli) {
      super(nama, alamat);
      this.alamat = alamat;
      this.kasir=kasir;
      this.namabarang = namabarang;
      this.hargabarang = hargabarang;
      this.jumlahbeli = jumlahbeli;
      totalBayar = hargabarang*jumlahbeli;
      cetakFaktur();
   }
   @Override
   public void cetakFaktur(){
   System.out.println("\nDREAM GRAND SUPERMART");   
   for(int eql =1; eql<= 30; eql++){
      System.out.print("=");
   }

   System.out.println("\nDATA PELANGGAN");
   for(int min =1; min<= 20; min++){
      System.out.print("-");
   }

   String nama;
   System.out.print("\nNama Pelanggan: "+ kasir);
   
   System.out.print("\nAlamat        : "+ alamat + "\n");
   
   for(int pls = 1; pls <= 30; pls++){
      System.out.print("+");
   }

   System.out.println("\nDATA PEMBELIAN BARANG");
   for(int min2 =1; min2<= 20; min2++){
      System.out.print("-");
   }

   System.out.print("\nKode Barang     :N- " + kodeBarang);
   System.out.print("\nNama Barang     : " + namabarang);
   System.out.print("\nHarga Barang    :Rp " + hargabarang);
   System.out.print("\nJumlah Beli     : " + jumlahbeli + " buah");
   System.out.print("\nTOTAL BAYAR     :Rp " + totalBayar+ "\n");
   for(int pls = 1; pls <= 30; pls++){
      System.out.print("+");
   }

   System.out.print("\nKasir           : " + kasir);
}
}
