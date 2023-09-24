/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10th;

/**
 *
 * @author LENOVO
 */
public class SinhVien {
    private String name;
    private int ac, sub;
    
    public SinhVien(String name, int ac, int sub){
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }
    
    public int getAc(){
        return this.ac;
    }
    public int getSub(){
        return this.sub;
    }
    public String getTen(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.ac + " " + this.sub;
    }
    
}
