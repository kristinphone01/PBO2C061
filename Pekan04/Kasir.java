import java.util.Scanner;


class Barang {
    
    private String nama;
    private int harga;
    private int jumlah;

    
    public Barang(String nama, int harga, int jumlah) {
        this.nama = nama;     
        this.harga = harga;
        this.jumlah = jumlah;
    }

    
    public int hitungTotal() {
        return harga * jumlah;
    }

    
    public void tampilkanData() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total       : " + hitungTotal());
    }
}


public class KasirMinimarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KASIR SEDERHANA ===");

        System.out.print("Masukkan nama barang  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga barang : ");
        int harga = input.nextInt();

        System.out.print("Masukkan jumlah beli  : ");
        int jumlah = input.nextInt();

        
        Barang barang1 = new Barang(nama, harga, jumlah);

        System.out.println("\n=== STRUK BELANJA ===");
        barang1.tampilkanData();
    }
}
