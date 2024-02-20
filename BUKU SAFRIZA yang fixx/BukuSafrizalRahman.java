/**
 * BukuSafrizalRahman
 */
public class BukuSafrizalRahman {

    
public class BukuSafrizalRahman {
    //Atribut    
    String jdl, pengarang;
    int halaman, stok, harga;
    
    public BukuSafrizalRahman(){

    }
    
    
    public BukuSafrizalRahman(String jdul, String pgg, int hlm, int stok, int hg){
    
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
    
    public BukuSafrizalRahman(String jdul, String pgg, int hlm, int stok, int hg){
    
        jdl = jdul;
        pengarang = pgg;
        halaman = hlm;
        this.stok = stok;
        harga = hg;
    
    
    }
    // public static void main(String[] args) {
    //     String mahaSewa = " Safrizal ";

    //     BukuSafrizal BukuMainSafrizal = new BukuSafrizal("20 th Century Girl", "Kim Boesook", 160, 29,  45000);

    //     // BukuSafrizal bukuSafrizalRahman = new BukuSafrizal("Judul Buku Baru", "Pengarang Baru", 250, 50, 75000);

    // }
    }
}