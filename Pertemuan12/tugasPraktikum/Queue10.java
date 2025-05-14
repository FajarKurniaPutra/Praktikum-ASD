public class Queue10 {
    Node10 front, rear;
    int size, max;

    public Queue10(int max) {
        this.max = max;
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(String nim, String nama) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan data.");
            return;
        }
        Mahasiswa10 mhs = new Mahasiswa10(nim, nama);
        Node10 baru = new Node10(mhs);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println(front.data.nama + " telah dipanggil dari antrian.");
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void peekDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void peekBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang mengantri.");
            return;
        }

        Node10 bantu = front;
        System.out.println("== Daftar Antrian Mahasiswa ==");
        while (bantu != null) {
            bantu.data.tampil();
            System.out.println("----------------------");
            bantu = bantu.next;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}