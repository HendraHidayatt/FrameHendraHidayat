/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
public class Transaksi {
    private int kode_transaksi;
    private int kode_costomer;
    private String status;
    private int tgl_order;
    private String alamat_pengirim;
    private String keterangan_lainnya;
    private int id_kota;
    private  String cara_bayar;
    
    public Transaksi(int kode_transaksi, int kode_costomer, String status, int tgl_order, String alamat_pengirim, String keterangan_lainnya, int id_kota, String cara_bayar){
      this.kode_transaksi=kode_transaksi;
      this.kode_costomer=kode_costomer;
      this.status=status;
      this.tgl_order=tgl_order;
      this.alamat_pengirim=alamat_pengirim;
      this.keterangan_lainnya=keterangan_lainnya;
      this.id_kota=id_kota;
      this.cara_bayar=cara_bayar;
    }
    
    public int getkode_transaksi(){
        return kode_transaksi;
    }
    
    public void setkode_transaksi(int kode_transaksi){
        this.kode_transaksi= kode_transaksi;
    }
    
    public int getkode_costomer(){
        return kode_costomer;
    }
    
    public void setkode_costomer(int kode_costomer){
        this.kode_costomer= kode_costomer;
    }
    
    public String getstatus(){
        return status;
}
 
    public void setstatus(String status){
        this.status= status;
     }
    
    public int gettgl_order(){
        return tgl_order;
}
 
    public void settgl_order(int tgl_order){
        this.tgl_order= tgl_order;
     }
    
    public String getalamat_pengirim(){
        return alamat_pengirim;
}
 
    public void setalamat_pengirim(String alamat_pengirim){
        this.alamat_pengirim= alamat_pengirim;
     }
    
    public String getketerangan_lainnya(){
        return keterangan_lainnya;
}
 
    public void setketerangan_lainnya(String keterangan_lainnya){
        this.keterangan_lainnya= keterangan_lainnya;
     }
    
    public int setid_kota(){
        return id_kota;
}
 
    public void setid_kota(int id_kota){
        this.id_kota= id_kota;
     }
    
    public String cara_bayar(){
        return cara_bayar;
}
 
    public void cara_bayar(String cara_bayar){
        this.cara_bayar= cara_bayar;
     }
    
}
