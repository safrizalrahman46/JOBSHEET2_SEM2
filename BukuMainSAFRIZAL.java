import java.util.Scanner;

public class BukuMainSAFRIZAL {
    public static void main(String[] args) {
        Buku bk1 = new Buku(); 
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "SAFRIZAL RAHMAN";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi(); 
        bk1.terjual(5); 
        bk1.gantiHarga(60000); 
        bk1.tampilInformasi(); 

        Buku bk2 = new Buku("KANTAL", "" );
    }
}

            class Buku {
                String judul;
                String pengarang;
                int halaman;
                int stok;
                int harga;

                // Konstruktor default
                Buku() {}


    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("---------------------");
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("---------------------");
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    void terjual(int jumlahTerjual) {
        if (jumlahTerjual <= stok) {
            stok -= jumlahTerjual;
            System.out.println(jumlahTerjual + " buku terjual.");
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    // Metode untuk mengubah harga buku
    void gantiHarga(int hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga buku telah diubah menjadi Rp" + harga);
    }
}
