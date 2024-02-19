/**
 * BukuSafrial
 */
public class BukuSafrial {

    //Atribut
    String jdl, pengarang;
    int halaman, stok, harga;
        
        //Konstruktor
        public BukuSafrial(String jdl, String pengarang, int halaman, int stok, int harga){
                this.halaman = halaman;
                this.jdl = jdl;
                this.pengarang = pengarang;
                this.harga = harga;
                this.stok = stok;
        }

                //Metode
                public String getJdl() {
                    return jdl;
                }
                public String getpengarang() {
                    return  pengarang;
                }
                public int gethalaman() {
                    return halaman;
                }
                public int getstok() {
                    return stok;
                }
                public int getharga() {
                    return harga;
                }

}