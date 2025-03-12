import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil m1 = new Mobil();
        m1.setKecepatan(50); 
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.setWaktu(1); 
        m1.displayMessage(); 
        System.out.println("================");

        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.displayMessage();
        m2.setWaktu(2);
        System.out.println("================");

        // Perulangan menu interaktif untuk pengguna
        while (true) {
            System.out.println("Pilih opsi : ");
            System.out.println("1. Tampilkan informasi");
            System.out.println("2. Ubah Informasi");
            System.out.println("3. Keluar program");
            System.out.print("Masukkan pilihan : ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan informasi kedua mobil
                    m1.displayMessage();
                    m2.displayMessage();
                    break;
                case 2:
                    // Menu untuk mengubah informasi mobil
                    System.out.println("Silahkan pilih informasi yang ingin diubah");
                    System.out.println("1. Kecepatan");
                    System.out.println("2. Warna");
                    System.out.print("Masukkan pilihan : ");

                    int pilihanModif = scanner.nextInt();
                    switch (pilihanModif) {
                        case 1:
                            // Mengubah kecepatan mobil
                            System.out.print("Masukkan kecepatan (km/jam): ");
                            double inputKecepatan = scanner.nextDouble();
                            System.out.print("Mobil mana yang mau dirubah kecepatannya (1/2) : ");
                            int modifKecepatan = scanner.nextInt();
                            if (modifKecepatan == 1) {
                                m1.setKecepatan(inputKecepatan); //memanggil method pada kelas mobil
                            } else if (modifKecepatan == 2) {
                                m2.setKecepatan(inputKecepatan); //memanggil method pada kelas mobil
                            }
                            break;
                        case 2:
                            // Mengubah warna mobil
                            System.out.print("Masukkan pilihan mobil yang ingin dirubah warnanya (1/2) : ");
                            int modifWarna = scanner.nextInt();
                            System.out.print("Masukkan warna : ");
                            String inputWarna = scanner.next();
                            if (modifWarna == 1) {
                                m1.setWarna(inputWarna); //memanggil method pada kelas mobil
                            } else if (modifWarna == 2) {
                                m2.setWarna(inputWarna); //memanggil method pada kelas mobil
                            }
                            break;
                    }
                    break;
                case 3:
                    // Keluar dari program
                    System.out.println("Sampai jumpa <3");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}
