
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai8th {
    
    public static boolean solve(int n) {
        String word = n + "";
        if(word.length() < 2) return false;
        for(int i = 0; i < word.length() - 1; i++) {
            if(word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        int dem1[] = new int[10005];
        int dem2[] = new int[10005];
        for(int i : a) {
            if(solve(i)) {
                dem1[i]++;
            }
        }
        for(int i : b) {
            if(solve(i)) {
                dem2[i]++;
            }
        }
        for(int i = 10; i < 10005; i++) {
            if(dem1[i] > 0 && dem2[i] > 0) {
                System.out.println(i + " " + dem1[i] + " " + dem2[i]);
            }
        }
    }
}
