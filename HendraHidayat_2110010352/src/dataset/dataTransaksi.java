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
public class dataTransaksi {
    
    private ArrayList <Integer> kode_transaksi;
    private ArrayList <Integer> kode_costomer;
    private ArrayList <String> status;
    private ArrayList <Integer> tgl_order;
    private ArrayList <String> alamat_pengirim;
    private ArrayList <String> keterangan_lainnya;
    private ArrayList <Integer> id_kota;
    private ArrayList <String> cara_bayar;
 
    public dataTransaksi (){
        kode_transaksi = new ArrayList <Integer>();
        kode_costomer = new ArrayList <Integer>();
        status = new ArrayList <String>();
        tgl_order = new ArrayList <Integer>();
        alamat_pengirim = new ArrayList <String>();
        keterangan_lainnya = new ArrayList <String>();
        id_kota = new ArrayList <Integer>();
        cara_bayar = new ArrayList <String>();
    }
    
    public void insertkode_transaksi (Integer isi){
        this.kode_transaksi.add(isi);
    }
    
    public ArrayList<Integer>getRecordkode_transaksi(){
        return this.kode_transaksi;
    }
    
    public void insertkode_costomer(Integer isi){
        this.kode_costomer.add(isi);
    }
    
    public ArrayList<Integer>getRecordkode_costomer(){
        return this.kode_costomer;
    }
    
    public void insertstatus(String isi){
        this.status.add(isi);
    }
    
    public ArrayList<String>getRecordstatus(){
        return this.status;
    }
    
    public void inserttgl_order(Integer isi){
        this.tgl_order.add(isi);
    }
    
    public ArrayList<Integer>getRecordtgl_order(){
        return this.tgl_order;
    }
    
    public void insertalamat_pengirim(String isi){
        this.alamat_pengirim.add(isi);
    }
    
    public ArrayList<String>getRecordalamat_pengirim(){
        return this.alamat_pengirim;
    }
    
    public void insertketerangan_lainnya(String isi){
        this.keterangan_lainnya.add(isi);
    }
    
    public ArrayList<String>getRecordketerangan_lainnya(){
        return this.keterangan_lainnya;
    }
    
    public void insertid_kota(Integer isi){
        this.id_kota.add(isi);
    }
    
    public ArrayList<Integer>getRecordid_kota(){
        return this.id_kota;
    }
    
    public void insertcara_bayar(String isi){
        this.cara_bayar.add(isi);
    }
    
    public ArrayList<String>getRecordcara_bayar(){
        return this.cara_bayar;
    }
    
}




