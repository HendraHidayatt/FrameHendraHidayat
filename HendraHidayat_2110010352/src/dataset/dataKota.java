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
public class dataKota {
    
    private ArrayList<Integer> id_kota; 
    private ArrayList<String> nama_kota;
    private ArrayList<Integer> ongkir_kirim;
    
    public dataKota(){
        
        id_kota = new ArrayList<Integer>();
        nama_kota = new ArrayList<String>();
        ongkir_kirim = new ArrayList<Integer>();
    
    };
    
    public void insertid_kota(Integer isi){
        this.id_kota.add(isi);
    }
    
    public ArrayList<Integer> getRecordid_kota(){
        return this.id_kota;
    }  
    
    public void insertnama_kota(String isi){
        this.nama_kota.add(isi);
    }
    
    public ArrayList<String> getRecordnama_kota(){
        return this.nama_kota;
    }
    
    public void insertongkir_kirim(Integer isi){
        this.ongkir_kirim.add(isi);
    }
    
    public ArrayList<Integer> getRecordongkir_kirim(){
        return this.ongkir_kirim;
    }
    
}