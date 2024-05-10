// Kelas VIP yang mengimplementasikan HargaTiket
class VIP extends TiketKonser {
    @Override
    public double getHarga() {
        return 436.41; // Harga tiket VIP dalam USD
    }

    @Override
    public String getNama() {
        return "VIP"; // Output yang akan keluar pada detail pemesanan
    }
}