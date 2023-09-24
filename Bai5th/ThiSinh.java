/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5th;

/**
 *
 * @author LENOVO
 */
public class ThiSinh {
    private String id,name, team, ten, school;
    
    public ThiSinh(int id,String name, String team) {
        this.name = name;
        this.id = "C" + String.format("%03d", id+1);
        this.team = team;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getTeam(){
        return this.team;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name;
    }
}
