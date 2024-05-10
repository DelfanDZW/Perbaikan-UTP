// Kelas CAT1 yang mengimplementasikan HargaTiket
class CAT1 extends TiketKonser {
    @Override
    public double getHarga() {
        return 311.72; // Harga tiket CAT1 dalam USD
    }

    @Override
    public String getNama() {
        return "CAT1"; // Output yang akan keluar pada detail pemesanan
    }
}