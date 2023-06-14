/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HendraHidayat;

/**
 *
 * @author Asus A407M
 */
public class Member {
    private String Nama;
    private String email;
    private int telp;
    private String alamat;
    private String usernama;
    private String Pasword;
    private int tgl_daftar;
    
    public Member(String Nama, String email, int telp, String alamat, String usernama, String Pasword, int tgl_daftar){
      this.Nama=Nama;
      this.email=email;
      this.telp=telp;
      this.alamat=alamat;
      this.usernama=usernama;
      this.Pasword=Pasword;
      this.tgl_daftar=tgl_daftar;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama= Nama;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email= email;
    }
    
    public int gettelp(){
        return telp;
}
 
    public void settelp(int telp){
        this.telp= telp;
     }
    
    public String getalamat(){
        return alamat;
}
 
    public void setalamat(String alamat){
        this.alamat= alamat;
     }
    public String getusernama(){
        return usernama;
}
 
    public void setusernama(String usernama){
        this.usernama= usernama;
     }
    public String getPasword(){
        return Pasword;
}
 
    public void setPasword(String Pasword){
        this.Pasword= Pasword;
     }
    
    public int settgl_daftar(){
        return tgl_daftar;
}
 
    public void settgl_daftar(int tgl_daftar){
        this.tgl_daftar= tgl_daftar;
     }
    
}
