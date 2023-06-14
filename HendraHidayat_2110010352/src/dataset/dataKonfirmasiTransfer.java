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
public class dataKonfirmasiTransfer {
    
    private ArrayList<Integer>kode_transaksi;
    private ArrayList<Integer>rekening;
    private ArrayList<String>nama_bank;
    private ArrayList<Integer>tgl_transfer;
    private ArrayList<String>atas_nama;
    private ArrayList<Integer>jml_transfer;
    private ArrayList<String>catatan;

    public dataKonfirmasiTransfer(){
        
      kode_transaksi = new ArrayList<Integer>(); 
      rekening = new ArrayList<Integer>();
      nama_bank = new ArrayList<String>();
      tgl_transfer = new ArrayList<Integer>();
      atas_nama = new ArrayList<String>();
      jml_transfer = new ArrayList<Integer>();
      catatan = new ArrayList<String>();
     
    }
    
    public void insertkode_transaksi(Integer isi){
        this.kode_transaksi.add(isi);
    }
    
   public ArrayList<Integer>getRecordkode_transaksi(){
       return this.kode_transaksi;
   }
   
   public void insertrekening(Integer isi){
       this.rekening.add(isi);
   }
   
   public ArrayList<Integer>getRecordrekening(){
       return this. rekening;
   }
   
   public void insertnama_bank(String isi){
       this.nama_bank.add(isi);
   }
   
   public ArrayList<String>getRecordnama_bank(){
       return this.nama_bank;
   }
   
   public void inserttgl_transfer(Integer isi){
       this.tgl_transfer.add(isi);
   }
   
   public ArrayList<Integer>getRecordtgl_transfer(){
       return this.tgl_transfer;
   }
   
   public void insertatas_nama(String isi){
       this.atas_nama.add(isi);
   }
   
   public ArrayList<String>getRecordatas_nama(){
       return this.atas_nama;
   }
   
   public void insertjml_transfer(Integer isi){
       this.jml_transfer.add(isi);
   }
   
   public ArrayList<Integer>getReordjml_transfer(){
       return this.jml_transfer;
   }
   
   public void insertcatatan(String isi){
       this.catatan.add(isi);
   }
   
   public ArrayList<String>getRecordcatatan(){
       return this.catatan;
   }
    
}
