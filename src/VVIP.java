// Kelas VVIP yang mengimplementasikan HargaTiket
class VVIP extends TiketKonser {
    @Override
    public double getHarga() {
        return 685.79; // Harga tiket VVIP dalam USD
    }

    @Override
    public String getNama() {
        return "UNLIMITED EXPERIENCE"; // Output yang akan keluar pada detail pemesanan
    }
}