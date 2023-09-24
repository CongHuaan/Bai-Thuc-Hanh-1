
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
public class bai11th {
    
    public static String solve(String s) {
        String ans = "";
        for(char i : s.toCharArray()) {
            if(i == '0' || i == '1') {
                ans += Character.toString(i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        for(String x : a) {
            long res = Long.parseLong(solve(x), 2);
            System.out.println(solve(x) + " " + res);
        }
    }
}
