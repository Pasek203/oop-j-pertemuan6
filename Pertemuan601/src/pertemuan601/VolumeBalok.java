/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author made
 */
public class VolumeBalok {
    //inisial property
    public int panjang,lebar,tinggi;
    private int hasil;
    int setLebar;
    
    //method hitung Volume Balok
    public int volume(){
        this.hasil = this.panjang*this.lebar*this.tinggi;
        return this.hasil;
    }
   public void setPanjang(int pj){
       this.panjang = pj;
   }
   public void setLebar(int lb){
       this.lebar = lb;
   }   
   public void setTinggi(int tg){
       this.tinggi = tg;
   }

    public int getPanjang(){
        return this.panjang;
    }
    public int getLebar(){
        return this.lebar;
    }
    public int getTinggi(){
        return this.tinggi;
    }

    
}
    
    

