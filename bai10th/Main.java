/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = Integer.parseInt(sc.nextLine());
        SinhVien sv[] = new SinhVien[t];
        for(int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String a = sc.nextLine();
            String word[] = a.split(" ");
            int ac = Integer.parseInt(word[0]);
            int sub = Integer.parseInt(word[1]);
            sv[i] = new SinhVien(name, ac, sub);
        }
        Arrays.sort(sv, new Comparator<SinhVien>(
        ) {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getAc() == o2.getAc()) {
                    if(o1.getSub() == o2.getSub()) {
                        if(o1.getTen().compareTo(o2.getTen()) < 0) return -1;
                        return 1;
                    }
                    else{
                        if(o1.getSub() < o2.getSub()) {
                            return -1;
                        }
                        return 1;
                    }
                }
                else {
                    if(o1.getAc() > o2.getAc()) return -1;
                    return 1;
                }
            }
        });
        
       for(int i = 0; i < t; i++) {
           System.out.println(sv[i]);
       }
    }
}
