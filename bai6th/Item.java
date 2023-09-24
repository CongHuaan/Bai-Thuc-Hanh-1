/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6th;

/**
 *
 * @author LENOVO
 */
public class Item {
    private String name,id,stt;
    private long price,sl,sale,pay;
    private char type;
    
    public Item(String name, String id, long price, long sl){
        this.name = name;
        this.id = id;
        this.price = price;
        this.sl = sl;
        this.type = id.charAt(id.length()-1);
        if(this.type == '1') {
            this.sale = (5 * this.sl * this.price / 10);
        }
        else {
            this.sale = (3 * this.sl * this.price / 10);
        }
        this.pay = this.sl * this.price - this.sale;
        this.stt = id.substring(1,id.length() - 1);
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.id + " " + this.stt + " " + this.sale + " " + this.pay;
    }
}
