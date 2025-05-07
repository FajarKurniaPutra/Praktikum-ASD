import java.util.Scanner;

public class LayananKRS10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS10 antrian = new AntrianKRS10(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa untuk KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Sudah KRS");
            System.out.println("11. Cetak Jumlah Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    Mahasiswa10 m = new Mahasiswa10(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                }
                case 2 -> antrian.panggil2Mahasiswa();
                case 3 -> antrian.lihatSemua();
                case 4 -> antrian.lihat2Terdepan();
                case 5 -> antrian.lihatAkhir();
                case 6 -> {
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                }
                case 7 -> {
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                }
                case 8 -> antrian.clear();
                case 9 -> antrian.cetakJumlahAntrian();
                case 10 -> antrian.cetakJumlahSudahKRS();
                case 11 -> antrian.cetakJumlahBelumKRS();
                case 0 -> System.out.println("Terima kasih.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
