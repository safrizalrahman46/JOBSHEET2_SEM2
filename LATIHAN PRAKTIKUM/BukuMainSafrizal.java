public class BukuMainSafrizal {
    public static void main(String[] args) {
        BukuSafrizal bk1 = new BukuSafrizal(); 
        bk1.jdl = "Today Ends Tomorrow Comes";
        bk1.pengarang = "SAFRIZAL RAHMAN";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.tampilinformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilinformasi();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        BukuSafrizal bk2 = new BukuSafrizal("20 th Century Girl", "Kim Boesook", 160, 29,  45000);
        bk2.terjual(11);
        bk2.tampilinformasi();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            // Buat object baru dengan nama bukuSafrizal2
        BukuSafrizal BukuSafrizalRahman = new BukuSafrizal("Sang Pemimpi", "Andrea Hirata", 368, 15, 150000);
        // BukuSafrizalRahman.hitungDiskon();
        // BukuSafrizalRahman.hitungHargaBayar();
        // BukuSafrizalRahman.hitungHargaDiskon();

        // Tampilkan informasi buku
        BukuSafrizalRahman.tampilinformasi();        

        
        // BukuSafrizalRahman bk3 = new BukuSafrizalRahman(); 
        // BukuSafrizalRahman bk3 = new BukuSafrizalRahman("Be My boyfriend", "Oh Jina", 1000, 100,  150000);
        // bk3.terjual(11);
        // bk3.tampilinformasi();
        // bk3.copyBuku(bk1);
        
        // bk3. = "Today Ends Tomorrow Comes";
        // bk3.pengarang = "SAFRIZAL RAHMAN";
        // bk3.halaman = 198;
        // bk3.stok = 13;
        // bk3.harga = 71000;
        // bk3.tampilinformasi();
        // bk3.terjual(5);
        // bk3.gantiHarga(60000);
        // bk3.tampilinformasi();

        // System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        // BukuSafrizalRahman bk3 = new BukuSafrizalRahman ("Be My Boyfriend", "Oh Jinaa", 1000, 29,  45000);
        // bk3.terjual(11);
        // bk3.tampilinformasi();


    }
}

            // class Buku {
            //     String judul;
            //     String pengarang;
            //     int halaman;
            //     int stok;
            //     int harga;

            //     // Konstruktor default
            //     Buku() {}


    // void tampilInformasi() {
    //     System.out.println("Judul: " + judul);
    //     System.out.println("---------------------");
    //     System.out.println("Pengarang: " + pengarang);
    //     System.out.println("Jumlah Halaman: " + halaman);
    //     System.out.println("---------------------");
    //     System.out.println("Stok: " + stok);
    //     System.out.println("Harga: Rp" + harga);
    // }

    // void terjual(int jumlahTerjual) {
    //     if (jumlahTerjual <= stok) {
    //         stok -= jumlahTerjual;
    //         System.out.println(jumlahTerjual + " buku terjual.");
    //     } else {
    //         System.out.println("Stok tidak mencukupi.");
    //     }
    // }

    // // Metode untuk mengubah harga buku
    // void gantiHarga(int hargaBaru) {
    //     harga = hargaBaru;
    //     System.out.println("Harga buku telah diubah menjadi Rp" + harga);
    // }


