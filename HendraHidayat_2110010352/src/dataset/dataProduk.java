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
public class dataProduk {
    
    private ArrayList <Integer> id_produk;
    private ArrayList <String> nama_produk;
    private ArrayList <String> komposisi;
    private ArrayList <String> indikasi;
    private ArrayList <String> dosis;
    private ArrayList <String> penyajian;
    private ArrayList <String> Perhatian;
    private ArrayList <String> efek_samping;
    private ArrayList <String> kemasan;
    private ArrayList <Integer> harga;
    private ArrayList <String> pabrik;
    private ArrayList <String> deskripsi;
    private ArrayList <Integer> id_katagori;
    
    public dataProduk(){
        
        id_produk = new ArrayList<Integer>();
        nama_produk = new ArrayList<String>();
        komposisi = new ArrayList<String>();
        indikasi = new ArrayList<String>();
        dosis = new ArrayList<String>();
        penyajian = new ArrayList<String>();
        Perhatian = new ArrayList<String>();
        efek_samping = new ArrayList<String>();
        kemasan = new ArrayList<String>();
        harga = new ArrayList<Integer>();
        pabrik = new ArrayList<String>();
        deskripsi = new ArrayList<String>();
        id_katagori = new ArrayList<Integer>();
    }
    
    public void insertid_produk(Integer isi){
        this.id_produk.add(isi);
    }
    
    public ArrayList<Integer> getRecordid_produk(){
        return this.id_produk;
    }
    
    public void insertnama_produk(String isi){
        this.nama_produk.add(isi);
    }
    
    public ArrayList<String> getRecordnama_produk(){
        return this.nama_produk;
    }
    
    public void insertkomposisi(String isi){
        this.komposisi.add(isi);
    }
    
    public ArrayList<String> getRecordkomposisi(){
        return this.komposisi;
    }
    
    public void insertindikasi(String isi){
        this.indikasi.add(isi);
    }
    
    public ArrayList<String> getRecordindikasi(){
        return this.indikasi;
    }
    
    public void insertdosis(String isi){
        this.dosis.add(isi);
    }
    
    public ArrayList<String> getRecorddosis(){
        return this.dosis;
    }
     
    public void insertpenyajian(String isi){
        this.penyajian.add(isi);
    }
    
    public ArrayList<String> getRecordpenyajian(){
        return this.penyajian;
    }
    
    public void insertPerhatian(String isi){
        this.Perhatian.add(isi);
    }
    
    public ArrayList<String> getRecordPerhatian(){
        return this.Perhatian;
    }
    
    public void insertefek_samping(String isi){
        this.efek_samping.add(isi);
    }
    
    public ArrayList<String> getRecordefek_samping(){
        return this.efek_samping;
    }
    
    public void insertkemasan(String isi){
        this.kemasan.add(isi);
    }
    
    public ArrayList<String> getRecordkemasan(){
        return this.kemasan;
    }
    
    public void insertharga(Integer isi){
        this.harga.add(isi);
    }
    
    public ArrayList<Integer> getRecordharga(){
        return this.harga;
    }
    
    public void insertpabrik(String isi){
        this.pabrik.add(isi);
    }
    
    public ArrayList<String> getRecordpabrik(){
        return this.pabrik;
    }
    
    public void insertdeskripsi(String isi){
        this.deskripsi.add(isi);
    }
    
    public ArrayList<String> getRecorddeskripsi(){
        return this.deskripsi;
    }
    
     public void insertid_katagori(Integer isi){
        this.id_katagori.add(isi);
    }
    
    public ArrayList<Integer> getRecordid_katagori(){
        return this.id_katagori;
    }
}
