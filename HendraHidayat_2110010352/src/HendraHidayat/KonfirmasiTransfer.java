/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
    public class KonfirmasiTransfer {
    private int kode_transaksi;
    private int rekening;
    private String nama_bank;
    private int tgl_transfer;
    private String atas_nama;
    private int jml_transfer;
    private String catatan;
    
    public KonfirmasiTransfer(int kode_transaksi, int rekening, String nama_bank, int tgl_transfer, String atas_nama, int jml_transfer, String catatan){
      this.kode_transaksi=kode_transaksi;
      this.rekening=rekening;
      this.nama_bank=nama_bank;
      this.tgl_transfer=tgl_transfer;
      this.atas_nama=atas_nama;
      this.jml_transfer=jml_transfer;
      this.catatan=catatan;
    }
    
    public int getkode_transaksi(){
        return kode_transaksi;
    }
    
    public void setkode_transaksi(int kode_transaksi){
        this.kode_transaksi= kode_transaksi;
    }
    
    public int getrekening(){
        return rekening;
    }
    
    public void setrekening(int rekening){
        this.rekening= rekening;
    }
    
    public String getnama_bank(){
        return nama_bank;
}
 
    public void setnama_bank(String nama_bank){
        this.nama_bank= nama_bank;
     }
    
    public int gettgl_transfer(){
        return tgl_transfer;
}
 
    public void settgl_transfer(int tgl_transfer){
        this.tgl_transfer= tgl_transfer;
     }
    public String getatas_nama(){
        return atas_nama;
}
 
    public void setatas_nama(String atas_nama){
        this.atas_nama= atas_nama;
     }
    public int getjml_transfer(){
        return jml_transfer;
}
 
    public void setjml_transfer(int jml_transfer){
        this.jml_transfer= jml_transfer;
     }
    
    public String getcatatan(){
        return catatan;
}
 
    public void catatan(String catatan){
        this.catatan= catatan;
     }
    
}
