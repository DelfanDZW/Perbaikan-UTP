// Kelas ini mengimplementasikan interface HargaTiket 
// yang memiliki metode untuk mendapatkan harga dan nama tiket.
abstract class TiketKonser implements HargaTiket {
    // Method abstrak getHarga digunakan untuk mendapatkan harga dari tiket konser.
    // Harus diimplementasikan oleh kelas turunannya.
    @Override
    public abstract double getHarga();
}