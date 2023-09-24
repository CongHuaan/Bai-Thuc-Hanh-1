/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15Th;

import java.util.TreeSet;

/**
 *
 * @author LENOVO
 */
public class WordSet {
    private TreeSet<String> Ts;
    public WordSet(String s) {
        this.Ts = new TreeSet<>();
        String a[] = s.trim().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            this.Ts.add(a[i].toLowerCase());
        }
    }
    
    public WordSet union(WordSet b) {
        WordSet ans = new WordSet("");
        for(String x : this.Ts) {
            ans.Ts.add(x);
        }
        for(String x : b.Ts) {
            ans.Ts.add(x);
        }
        return ans;
    }
    
    public WordSet intersection (WordSet b) {
        WordSet ans = new WordSet("");
        for(String x : this.Ts) {
            if(b.Ts.contains(x)) {
                ans.Ts.add(x);
            }
        }
        return ans;
    }
    public String toString(){
        String s = "";
        for(String x : this.Ts) {
            s += x + " ";
        }
        return s.trim();
    }
    
    
}
