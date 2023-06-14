/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
public class Katagori {
    private int id_katagori;
    private String katagori;
    private String sub_katagori;
    
    public Katagori(int id_katagori, String katagori, String sub_katagori){
      this.id_katagori=id_katagori;
      this.katagori=katagori;
      this.sub_katagori=sub_katagori;
    }
    
    public int id_katagori(){
        return id_katagori;
    }
    
    public void setid_katagori(int id_katagori){
        this.id_katagori= id_katagori;
    }
    
    public String getkatagori(){
        return katagori;
    }
    
    public void setkatagori(String katagori){
        this.katagori= katagori;
    }
    
    public String getsub_katagori(){
        return sub_katagori;
}
 
    public void setsub_katagori(String sub_katagori){
        this.sub_katagori= sub_katagori;
     }
    
}
