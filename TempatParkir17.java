import java.util.Scanner;

public class TempatParkir17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0, i = 1;

        System.out.println("-------- Tarif Parkir ---------");
        System.out.println("1. Mobil \n2. Motor \n0. Keluar");

        do {
            System.out.print("Masukkan jenis kendaraan ke " + i + " (0 untuk keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }

                System.out.println("Biaya parkir: Rp " + (total - (i > 1 ? total : 0)));
                i++;
            } else if (jenis != 0) {
                System.out.println("Input tidak valid. Masukkan '1' untuk Mobil, '2' untuk Motor, atau '0' untuk keluar program.");
            }
        } while (jenis != 0);

        System.out.println("Anda keluar dari program");
        System.out.println("Total tarif parkir : Rp " + total);
    }
}