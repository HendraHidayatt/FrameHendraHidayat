/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
public class Produk {
    private int id_produk;
    private String nama_produk;
    private String komposisi;
    private String indikasi;
    private String dosis;
    private String penyajian;
    private String Perhatian;
    private String efek_samping;
    private String kemasan;
    private int harga;
    private String pabrik;
    private String deskripsi;
    private int id_katagori;
    
    public Produk(int id_produk, String nama_produk, String komposisi, String indikasi, String dosis, String penyajian, String Perhatian, String efek_samping, String kemasan, int harga, String pabrik, String deskripsi, int id_katagori){
      this.id_produk=id_produk;
      this.nama_produk=nama_produk;
      this.komposisi=komposisi;
      this.indikasi=indikasi;
      this.dosis=dosis;                                            
      this.penyajian=penyajian;
      this.Perhatian=Perhatian;
      this.efek_samping=efek_samping;
      this.kemasan=kemasan;
      this.harga=harga;
      this.pabrik=pabrik;
      this.deskripsi=deskripsi;
      this.id_katagori=id_katagori;
    }
    
    public int getid_produk(){
        return id_produk;
    }
    
    public void setid_produk(int id_produk){
        this.id_produk= id_produk;
    }
    
    public String getnama_produk(){
        return nama_produk;
    }
    
    public void setnama_produk(String nama_produk){
        this.nama_produk= nama_produk;
    }
    
    public String getkomposisi(){
        return komposisi;
}
 
    public void setkomposisi(String komposisi){
        this.komposisi= komposisi;
     }
    
    public String getindikasi(){
        return indikasi;
}
 
    public void setindikasi(String indikasi){
        this.indikasi= indikasi;
     }
    
    public String getdosis(){
        return dosis;
}
 
    public void setdosis(String dosis){
        this.dosis= dosis;
     }
    
    public String getpenyajian(){
        return penyajian;
}
 
    public void setpenyajian(String penyajian){
        this.penyajian= penyajian;
     }
    
    public String getPerhatian(){
        return Perhatian;
}
 
    public void setPerhatian(String Perhatian){
        this.Perhatian= Perhatian;
     }
    
    public String getefek_samping(){
        return efek_samping;
}
 
    public void setefek_samping(String efek_samping){
        this.efek_samping= efek_samping;
     }
    
    public String getkemasan(){
        return efek_samping;
}
 
    public void setkemasan(String kemasan){
        this.kemasan= kemasan;
     }
    
    public int getharga(){
        return harga;
}
 
    public void setharga(int harga){
        this.harga= harga;
     }
    
    public String getpabrik(){
        return pabrik;
}
 
    public void setpabrik(String pabrik){
        this.pabrik= pabrik;
     }
    
    public String getdeskripsi(){
        return deskripsi;
}
 
    public void setdeskripsi(String deskripsi){
        this.deskripsi= deskripsi;
     }
    
    public int getid_katagori(){
        return id_katagori;
}
 
    public void setid_katagori(int id_katagori){
        this.id_katagori= id_katagori;
     }
    
}
