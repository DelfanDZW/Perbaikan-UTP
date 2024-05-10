// Kelas PemesananTiket untuk mencetak nota pemesanan
class PemesananTiket {
    private String namaPemesan;
    private String kodePesanan;
    private String tanggalPesanan;
    private String namaTiket;
    private double totalHarga;

    // Konstruktor untuk PemesananTiket
    public PemesananTiket(String namaPemesan, String kodePesanan, String tanggalPesanan, HargaTiket tiket) {
        this.namaPemesan = namaPemesan;
        this.kodePesanan = kodePesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.namaTiket = tiket.getNama();
        this.totalHarga = tiket.getHarga();
    }

    // Method untuk mencetak nota pemesanan
    public void cetakNota() {
        System.out.println("\n-----Detail Pesanan-----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodePesanan);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket yang dipesan: " + namaTiket);
        System.out.println("Total Harga: " + totalHarga + " USD");
    }
}