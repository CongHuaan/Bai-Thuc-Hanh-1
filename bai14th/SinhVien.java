/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14th;

/**
 *
 * @author LENOVO
 */
public class SinhVien {
    private String id,name,sdt,email,detai,sosanh;
    
    public SinhVien(String id, String name, String sdt, String email){
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setDetai(String s){
        this.detai = s;
    }
    
    public void setSoSanh(String s) {
        this.sosanh = s;
    }
    
    public String getSoSanh(){
        return this.sosanh;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sdt + " " + this.email + " " + this.detai;
    }
}
