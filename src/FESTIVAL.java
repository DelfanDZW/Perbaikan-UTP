// Kelas FESTIVAL yang mengimplementasikan HargaTiket
class FESTIVAL extends TiketKonser {
    @Override
    public double getHarga() {
        return 249.38; // Harga tiket FESTIVAL dalam USD
    }

    @Override
    public String getNama() {
        return "FESTIVAL"; // Output yang akan keluar pada detail pemesanan
    }
}