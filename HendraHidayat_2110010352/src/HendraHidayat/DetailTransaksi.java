/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
public class DetailTransaksi {
    private int jml_pesanan;
    private int kode_transaksi;
    private int id_produksi;
    
    public DetailTransaksi(int jml_pesanan, int kode_transaksi, int id_produksi){
      this.jml_pesanan=jml_pesanan;
      this.kode_transaksi=kode_transaksi;
      this.id_produksi=id_produksi;
    }
    
    public int getjml_pesanan(){
        return jml_pesanan;
    }
    
    public void setjml_pesanan(int jml_pesanan){
        this.jml_pesanan= jml_pesanan;
    }
    
    public int getkode_transaksi(){
        return kode_transaksi;
    }
    
    public void setkode_transaksi(int kode_transaksi){
        this.kode_transaksi= kode_transaksi;
    }
    
    public int getid_produksi(){
        return id_produksi;
}
 
    public void setid_produksi(int id_produksi){
        this.id_produksi= id_produksi;
     }
    
}
