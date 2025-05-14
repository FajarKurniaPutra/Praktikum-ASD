import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 
        Mahasiswa10[] daftarMahasiswa = new Mahasiswa10[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            daftarMahasiswa[i] = new Mahasiswa10(nim, nama, kelas, ipk);
        }

        for (int i = 0; i < jumlah; i++) {
            Mahasiswa10 mhs = daftarMahasiswa[i];

            System.out.println("\nMasukkan posisi untuk Mahasiswa ke-" + (i + 1) + ": " + mhs.nama);
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah di indeks tertentu");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Ditambahkan ke akhir.");
                    sll.addLast(mhs);
            }
        }

        System.out.println("\nLinked List setelah semua data ditambahkan:");
        sll.print();

        sc.close();
    }
}

// public class SLLMain10 {
//     public static void main(String[] args) {
//         SingleLinkedList10 sll = new SingleLinkedList10();
//         Mahasiswa10 mhs1 = new Mahasiswa10("21212200", "Alvaro", "1A", 4.0);
//         Mahasiswa10 mhs2 = new Mahasiswa10("21212201", "Bimon", "2B", 3.8);
//         Mahasiswa10 mhs3 = new Mahasiswa10("21212202", "Cintia", "3C", 3.5);
//         Mahasiswa10 mhs4 = new Mahasiswa10("21212203", "Dirga", "4D", 3.6);
//         sll.print();
//         sll.addFirst(mhs4);
//         sll.print();
//         sll.addLast(mhs1);
//         sll.print();
//         sll.insertAfter("Dirga", mhs3);
//         sll.insertAt(2, mhs2);
//         sll.addLast(mhs1);
//         sll.print();

//         System.out.println("data index 1 : ");
//         sll.getData(1);
//         System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
//         System.out.println();

//         sll.removeFirst();
//         sll.removeLast();
//         sll.print();
//         sll.removeAt(0);
//         sll.print();
//     }
// }