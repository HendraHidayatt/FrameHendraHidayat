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
public class dataKatagori {
    private ArrayList<Integer> id_katagori; 
    private ArrayList<String> katagori;
    private ArrayList<String> sub_katagori;
    
    public dataKatagori(){
        
        id_katagori = new ArrayList<Integer>();
        katagori = new ArrayList<String>();
        sub_katagori = new ArrayList<String>();
        };
        
        
    public void insertid_katagori(Integer isi){
        this.id_katagori.add(isi);
    }
    
    public ArrayList<Integer> getRecordid_katagori(){
        return this.id_katagori;
    }  
    
    public void insertkatagori(String isi){
        this.katagori.add(isi);
    }
    
    public ArrayList<String> getRecordkatagori(){
        return this.katagori;
    }
    
    public void insertsub_katagori(String isi){
        this.sub_katagori.add(isi);
    }
    
    public ArrayList<String> getRecordsub_katagori(){
        return this.sub_katagori;
    }
    
    }
    



