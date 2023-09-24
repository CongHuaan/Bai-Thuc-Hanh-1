/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13th;

/**
 *
 * @author LENOVO
 */
public class Subject {
    private String id, name, type;
    private int note = 0;
    
    public Subject(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public String getId(){
        return this.id;
    }
    public int getNote(){
        return this.note;
    }
    
    public void setNote(int i) {
        this.note = i;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.type;
    }
}
