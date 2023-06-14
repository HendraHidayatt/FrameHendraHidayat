/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Asus A407M
 */
public class dataDetailTransaksi {
    private ArrayList<Integer> jml_pesanan; 
    private ArrayList<Integer> kode_transaksi;
    private ArrayList<Integer> id_produksi;

public dataDetailTransaksi (){
  jml_pesanan = new ArrayList<Integer>();
  kode_transaksi = new ArrayList<Integer>();
  id_produksi = new ArrayList<Integer>();
};

  public void insertjml_pesanan(Integer isi){
        this.jml_pesanan.add(isi);
    }
    
    public ArrayList<Integer> getRecordjml_pesanan(){
        return this.jml_pesanan;
    }  
    
    public void insertkode_transaksi(Integer isi){
        this.kode_transaksi.add(isi);
    }
    
    public ArrayList<Integer> getRecordkode_transaksi(){
        return this.kode_transaksi;
    }
    public void insertid_produksi(Integer isi){
        this.id_produksi.add(isi);
    }
    
    public ArrayList<Integer> getRecordid_produksi(){
        return this.id_produksi;
    }  
}

