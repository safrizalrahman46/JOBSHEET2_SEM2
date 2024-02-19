public class BUKUSAFRIZAL {
    public static void main(String[] args) {
        
        // tampilinformasi;
    }
    //Atribut
    String jdl, pengarang;
    int halaman, stok, harga;

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

    void terjual(int jmlh){
        stok -= jmlh;
    }

    void Kulakan(int jmlh){
        stok += jmlh;
    }

    void gantiHarga(int jmlh){
        stok -= jmlh;
    }
        

    
}
