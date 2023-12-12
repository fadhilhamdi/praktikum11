import java.util.InputMismatchException;
import java.util.*;
public class simulator  {
    public static void main(String[] args) {
        String y = "true";
        Integer hargabarang =0;
        Integer jumlahbeli =0;
        while (y.equals("true")) {
            boolean input = false;
            Scanner custom = new Scanner(System.in);
            Scanner number = new Scanner(System.in);
            System.out.print("Nama Pelanggan : ");
            String nama = custom.nextLine();
            System.out.print("Alamat         : ");
            String alamat = custom.nextLine();
            System.out.print("Nama Barang    : ");
            String namabarang = custom.nextLine();
            System.out.print("Kasir          : ");
            String kasir = custom.nextLine();
            do{
                try{
                    System.out.print("Harga Barang   : "+hargabarang);
                    hargabarang = number.nextInt();
                    input=true;
                } catch(InputMismatchException e){
                    System.out.print("Input dengan bilangan bulat");
                    number.nextLine();}
            }while(!input);
                input=false;
                do{
                    try{
                        System.out.print("Jumlah Barang  : ");
                        jumlahbeli = number.nextInt();
                        input = true;
                    }catch(InputMismatchException e){
                        System.out.print("Input dengan bilangan bulat");
                        number.next();
                    }
                }while (!input);
                    hitungTotalBayar mart = new hitungTotalBayar(nama,alamat,namabarang,kasir,hargabarang,jumlahbeli);
                    //hitungTotalBayar mart = new hitungTotalBayar (nama, alamat, namabarang, kasir, hargabarang, jumlahbeli);
                    Scanner on = new Scanner(System.in);
                    System.out.println();
                    System.out.println("ketika true untuk menambah");
                    y = on.next();
                }
            }
        }

