public class Mobil {

    // Deklarasi atribut private agar tidak bisa diakses langsung dari luar kelas
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu; 
    private double jarak; 

    // Method setter untuk mengatur nomor plat
    public void setNoPlat(String s) {
        noPlat = s;
    }

    // Method setter untuk mengatur warna mobil
    public void setWarna(String s) {
        warna = s;
    }

    // Method setter untuk mengatur manufaktur atau merek mobil
    public void setManufaktur(String s) {
        manufaktur = s;
    }

    // Method private untuk mengubah kecepatan dari km/h ke m/s
    private double rubahKecepatan(double i) {
        i = (i * 1000) / 3600; // Konversi km/h ke m/s
        return i;
    }

    // Method public untuk mengatur kecepatan dengan input dari user dalam km/h
    public double setKecepatan(double i) {
        kecepatan = rubahKecepatan(i); // Mengubah kecepatan ke m/s sebelum disimpan
        return kecepatan;
    }

    // Method private untuk mengubah waktu dari jam ke detik
    private double rubahSekon(double i) {
        i = i * 3600; // Konversi jam ke detik
        return i;
    }

    // Method public untuk mengatur waktu tempuh dengan input dari user dalam jam
    public double setWaktu(double i) {
        waktu = rubahSekon(i); // Mengubah waktu ke detik sebelum disimpan
        return waktu;
    }

    // Method private untuk menghitung jarak tempuh berdasarkan kecepatan dan waktu
    private double hitungJarak() {
        jarak = (kecepatan * waktu) / 1000; // Menghitung jarak dalam km
        return jarak;
    }

    // Method untuk menampilkan informasi mobil dan hasil perhitungan jarak tempuh
    public void displayMessage() {
        System.out.println("Mobil anda adalah merek : " + manufaktur);
        System.out.println("mempunyai nomor plat : " + noPlat);
        System.out.println("serta memililki warna : " + warna);
        System.out.println("dan mampu menempuh kecepatan : " + kecepatan + " m/s");
        System.out.println();
        
        hitungJarak(); // Menghitung jarak tempuh berdasarkan kecepatan dan waktu
        
        System.out.printf("Lama perjalanan : %.2f jam", (waktu / 3600)); // Konversi detik ke jam
        System.out.println();
        System.out.printf("Jarak yang dapat ditempuh : %.2f km\n", jarak);
    }
}
