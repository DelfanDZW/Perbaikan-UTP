import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pesan selamat datang
        System.out.println("Selamat datang di Pemesanan Tiket!");

        // Meminta input nama pemesan        
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();


        // Menampilkan pilihan jenis tiket  dan menginput pilihan
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukan pilihan: ");
        int jenisTiket = scanner.nextInt();

        // Inisialisasi variabel tiket dengan nilai null.
        TiketKonser tiket = null;
        // Pemilihan nilai untuk variabel jenisTiket menggunakan switch-case.
        switch (jenisTiket) {
            // Jika jenisTiket adalah 1, buat objek tiket sebagai instance dari kelas CAT8.
            case 1:
                tiket = new CAT8();
                break;
            // Jika jenisTiket adalah 2, buat objek tiket sebagai instance dari kelas CAT1.
            case 2:
                tiket = new CAT1();
                break;
            // Jika jenisTiket adalah 3, buat objek tiket sebagai instance dari kelas FESTIVAL.
            case 3:
                tiket = new FESTIVAL();
                break;
            // Jika jenisTiket adalah 4, buat objek tiket sebagai instance dari kelas VIP.
            case 4:
                tiket = new VIP();
                break;
            // Jika jenisTiket adalah 5, buat objek tiket sebagai instance dari kelas VVIP.
            case 5:
                tiket = new VVIP();
                break;
            // Jika jenisTiket tidak sesuai dengan pilihan yang valid, tampilkan pesan kesalahan dan keluar dari metode.
            default:
                System.out.println("Pilihan tiket tidak valid.");
                return;
        }

        // Mendapatkan tanggal saat ini
        String currentDate = getCurrentDate();

        // Untuk membuat objek pesanan tiket
        PemesananTiket pesanan = new PemesananTiket(namaPemesan, generateKodeBooking(), currentDate, tiket);
        pesanan.cetakNota();
    }

    // Method untuk generate kode booking (random)
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    // Method untuk mendapatkan tanggal saat ini
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}