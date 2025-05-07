public class AntrianKRS10 {
    Mahasiswa10[] data;
    int front, rear, size, max;
    int totalMahasiswaDitangani = 0;
    final int TOTAL_MAHASISWA = 30;

    public AntrianKRS10(int max) {
        this.max = max;
        data = new Mahasiswa10[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() { return size == 0; }

    public boolean isFull() { return size == max; }

    public void clear() {
        front = 0; rear = -1; size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa10 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggil2Mahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa berikut:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa10 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalMahasiswaDitangani++;
        }
    }

    public void lihatSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong."); return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling akhir:");
        data[rear].tampilkanData();
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahSudahKRS() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: " + totalMahasiswaDitangani);
    }

    public void cetakJumlahBelumKRS() {
        int sisa = TOTAL_MAHASISWA - totalMahasiswaDitangani;
        System.out.println("Jumlah mahasiswa belum proses KRS: " + sisa);
    }
}