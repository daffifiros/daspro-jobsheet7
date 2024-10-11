import java.util.Scanner;
public class Bioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double hargaTiket = 50000;
        double diskon, totalHarga;
        int tiket, totalTiket = 0, i = 1;
        long pendapatan = 0;
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("--------------------------- Perhitungan Tiket Bioskop ---------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        
        while (true) {
            System.out.print("\nMasukkan jumlah tiket pelanggan ke-" + i + " (0 untuk keluar dari program): ");
            
            if (sc.hasNextInt()) {
                tiket = sc.nextInt();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.next();
                continue;
            }

            if (tiket == 0) {
                System.out.println("Transaksi Selesai");
                break;
            } else if (tiket < 0) {
                System.out.println("Invalid. Silakan masukkan jumlah tiket yang benar.");
                continue;
            }

            if (tiket > 10) {
                diskon = 0.15;
                System.out.println("Diskon 15%");
            } else if (tiket > 4) {
                diskon = 0.10;
                System.out.println("Diskon 10%");
            } else {
                diskon = 0;
            }
    
            totalHarga = hargaTiket * tiket;
            long totalHargaAfter = (int) ((int) totalHarga - (totalHarga * diskon));// Menggunakan Math.round() untuk pembulatan yang lebih akurat
            pendapatan += totalHargaAfter;
            totalTiket += tiket;
            
            System.out.println("Total harga: Rp " + totalHargaAfter);
            
            i++;
        }
        
        System.out.println("Pendapatan harian: Rp " + pendapatan);
        System.out.println("Total tiket yang terjual: " + totalTiket);
    }
}