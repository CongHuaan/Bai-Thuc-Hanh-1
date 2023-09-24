/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5th;

/**
 *
 * @author LENOVO
 */
public class Team {
    private String stt,id, name, school, ten;
    
    public Team(int id, String name, String school) {
        this.id = "Team" + String.format("%02d", id + 1);
        this.name = name;
        this.school = school;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.school;
    }
}
