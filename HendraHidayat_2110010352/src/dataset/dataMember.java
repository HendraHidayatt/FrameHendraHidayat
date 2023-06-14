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
public class dataMember {
    private ArrayList<String> Nama;
    private ArrayList<String> email;
    private ArrayList<Integer> telp;
    private ArrayList<String> alamat;
    private ArrayList<String> usernama;
    private ArrayList<String> Pasword;
    private ArrayList<Integer> tgl_daftar;
    
    public dataMember (){
        Nama = new ArrayList<String>();
        email = new ArrayList<String>();
        telp = new ArrayList<Integer>();
        alamat = new ArrayList<String>();
        usernama = new ArrayList<String>();
        Pasword = new ArrayList<String>();
        tgl_daftar = new ArrayList<Integer>();
           
    };
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertemail(String isi){
        this.email.add(isi);
    }
    
    public ArrayList<String> getRecordemail(){
        return this.email;
    }
    
    public void inserttelp(Integer isi){
        this.telp.add(isi);
    }
    
    public ArrayList<Integer> getRecordtelp(){
        return this.telp;
    }
    
    public void insertalamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordalamat(){
        return this.alamat;
    }
    
    public void insertusernama(String isi){
        this.usernama.add(isi);
    }
    
    public ArrayList<String> getRecordusernama(){
        return this.usernama;
    }
    public void insertPasword(String isi){
        this.Pasword.add(isi);
    }
    
    public ArrayList<String> getRecordPasowrd(){
        return this.Pasword;
    }
    public void inserttgl_daftar(Integer isi){
        this.tgl_daftar.add(isi);
    }
    
    public ArrayList<Integer> getRecordtgl_daftar(){
        return this.tgl_daftar;
    }
}
