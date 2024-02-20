/**
 * BukuSafrizal
 */
public class BukuSafrizal {
//Atribut    
String jdl, pengarang;
int halaman, stok, harga, hitungHargaBayar, hitungHargaDiskon, hitungDiskon;

public static void main(String[] args) {
    
        // BukuSafrizal BukuSafrizalRahman = new BukuSafrizal("Only Love", "Andreas Bondes", 368, 19, 150000);


        // Menampilkan informasi buku baru
        // System.out.println("Informasi buku baru:");
        // BukuSafrizalRahman.tampilInformasi();

        // Menghitung harga total
        int jumlahTerjual = 10;
        int hargaTotal = BukuSafrizalRahman.hitungHargaTotal(jumlahTerjual);
        System.out.println("Harga Total: " + hargaTotal);

        // Menghitung diskon
        int diskon = BukuSafrizalRahman.hitungDiskon(hargaTotal);
        System.out.println("Diskon: " + diskon);

        // Menghitung harga bayar
        int hargaBayar = BukuSafrizalRahman.hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Harga Bayar: " + hargaBayar);
}


    public BukuSafrizal(){
    
    }


public BukuSafrizal(String jdul, String pgg, int hlm, int stok, int hg){

    jdl = jdul;
    pengarang = pgg;
    halaman = hlm;
    this.stok = stok;
    harga = hg;


}

    void tampilinformasi(){
        System.out.println("Judul BUku Yaw = " + jdl);
        //System.out.println("===============================================");
        //System.out.println("===============================================");
        System.out.println("Pengarang Buku yaw = " + pengarang);
        System.out.println("Jumlah Halaman Bukunye Berapa = " + halaman);
        //System.out.println("===============================================");
        //System.out.println("===============================================");
        System.out.println("Sisa Stok Berapa Bos = " + stok);
        System.out.println("HargaNyee = " +  harga);
        //System.out.println("===============================================");
        //System.out.println("===============================================");
    }

// void terjual(int jmlh){
//     stok -= jmlh;
// }

//Setelah DImodif 
// void terjual(int jmlh){
//     if(stok > 0){
//         stok -= jmlh;
//     } else {
//         System.out.println("Stok habis, Belum Kulakan.");
//     }
    // }
    void terjual(int jml){
        stok -= jml;
    }

    void Kulakan(int jmlh){
        stok += jmlh;
    }

    void gantiHarga(int jmlh){
        stok -= jmlh;
    }

    // Menghitung harga total
    public int hitungHargaTotal(int jmlh) {
        return jmlh * harga;
    }

    // Menghitung diskon
    public int hitungDiskon(int total) {
        int diskon;
        if (total > 150000) {
            diskon = total * 12 / 100;
        } else if (total > 75000) {
            diskon = total * 5 / 100;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    // Menghitung harga bayar
    public int hitungHargaBayar(int total, int diskon) {
        return total - diskon;
    }



public BUKUSAFRIZAL(String jdul, String pgg, int hlm, int stok, int hg){

    jdl = jdul;
    pengarang = pgg;
    halaman = hlm;
    this.stok = stok;
    harga = hg;


}
    
}