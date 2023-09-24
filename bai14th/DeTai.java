/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14th;

/**
 *
 * @author LENOVO
 */
public class DeTai {
    private String id,name, detai;
    
    public DeTai(int id,String name, String detai) {
        this.id = "DT" + String.format("%03d", id + 1);
        this.name = name;
        this.detai = detai;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getDeTai(){
        return this.detai;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.detai;
    }
}
