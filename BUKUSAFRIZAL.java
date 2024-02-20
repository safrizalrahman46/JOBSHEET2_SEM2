public class BUKUSAFRIZAL {
public static void main(String[] args) {
        
        // tampilinformasi;
    }
    //Atribut    
    String jdl, pengarang;
    int halaman, stok, harga;

    public BUKUSAFRIZAL(){

    }

    public BUKUSAFRIZAL(String jdl, String pgg, int hlm, int stok, int hg){

        jdl = jdl;
        pengarang = pgg;
        halaman = hlm;
        this.stok = stok;
        harga = hg;


    }
    
    void tampilinformasi(){
        System.out.println("Judul BUku Yaw " + jdl);
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Pengarang Buku yaw" + pengarang);
        System.out.println("Jumlah Halaman Bukunye bERAPE" + halaman);
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Sisa Stok Berapa Bos" + stok);
        System.out.println("HargaNyee" +  harga);
        System.out.println("===============================================");
        System.out.println("===============================================");
    }

    // void terjual(int jmlh){
    //     stok -= jmlh;
    // }

    //Setelah DImodif 
    void terjual(int jmlh){
        if(stok > 0){
            stok -= jmlh;
        } else {
            System.out.println("Stok habis, Belum Kulakan.");
        }
    }
    
    void Kulakan(int jmlh){
        stok += jmlh;
    }

    void gantiHarga(int jmlh){
        stok -= jmlh;
    }
        

    
}
