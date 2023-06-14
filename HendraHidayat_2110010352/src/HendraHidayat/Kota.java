/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
    public class Kota {
    private int id_kota;
    private String nama_kota;
    private int ongkir_kirim;
    
    public Kota(int id_kota, String nama_kota, int ongkir_kirim){
      this.id_kota=id_kota;
      this.nama_kota=nama_kota;
      this.ongkir_kirim=ongkir_kirim;
    }
    
    public int getid_kota(){
        return id_kota;
    }
    
    public void setid_kota(int id_kota){
        this.id_kota= id_kota;
    }
    
    public String getnama_kota(){
        return nama_kota;
    }
    
    public void setnama_kota(String nama_kota){
        this.nama_kota= nama_kota;
    }
    
    public int getongkir_kirim(){
        return ongkir_kirim;
}
 
    public void setongkir_kirim(int ongkir_kirim){
        this.ongkir_kirim= ongkir_kirim;
     }
    
}
