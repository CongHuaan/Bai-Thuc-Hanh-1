
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai4th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> se = new TreeSet<>();
        Set<String> se2 = new TreeSet<>();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        for(int i = 0; i< n; i++) {
            String s = sc.nextLine();
            String tmp[] = s.split("\\s+");
            for(int j = 0; j < tmp.length; j++) {
                tmp[j] = Character.toLowerCase(tmp[j].charAt(0)) + tmp[j].substring(1).toLowerCase();
                a.add(tmp[j]);
            }
        }
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< m; i++) {
            String s = sc.nextLine();
            String tmp[] = s.split("\\s+");
            for(int j = 0; j < tmp.length; j++) {
                tmp[j] = Character.toLowerCase(tmp[j].charAt(0)) + tmp[j].substring(1).toLowerCase();  
                b.add(tmp[j]);
            }
        }
        for(String j : a) {
            if(!b.contains(j)) {
                se.add(j);
            }
        }
        for(String j : b) {
            if(!a.contains(j)) {
                se2.add(j);
            }
        }
        for(String j : se){
            System.out.print(j + " ");
        }
        System.out.println();
        for(String j : se2){
            System.out.print(j + " ");
        }  
    }
}
