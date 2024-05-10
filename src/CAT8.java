// Kelas CAT8 yang mengimplementasikan HargaTiket
public class CAT8 extends TiketKonser {
    @Override
    public double getHarga() {
        return 93.52; // Harga tiket CAT8 dalam USD
    }

    @Override
    public String getNama() {
        return "CAT8"; // Output yang akan keluar pada detail pemesanan
    }
}