/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14th;

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
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        int t = Integer.parseInt(sc1.nextLine());
        SinhVien sv[] = new SinhVien[t];
        for(int i = 0; i < t; i++) {
            String id = sc1.nextLine();
            String name = sc1.nextLine();
            String sdt = sc1.nextLine();
            String email = sc1.nextLine();
            sv[i] = new SinhVien(id, name, sdt, email);
        }
        int n = Integer.parseInt(sc2.nextLine());
        DeTai dt[] = new DeTai[n];
        for(int i = 0; i  < n; i++) {
            String name = sc2.nextLine();
            String detai = sc2.nextLine();
            dt[i] = new DeTai(i,name, detai);
        }
        int m = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < m; i++) {
            String s = sc3.nextLine();
            String a[] = s.split("\\s+");
            for(int j = 0; j < m; j++) {
                if(sv[j].getId().equals(a[0])) {
                    for(int k = 0; k < n; k++) {
                        if(dt[k].getId().equals(a[1])) {
                            sv[j].setDetai(dt[k].toString());
                            sv[j].setSoSanh(dt[k].getDeTai());
                        }
                    } 
                }
            }
        }
        
        Arrays.sort(sv, new Comparator<SinhVien>(
        ) {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getSoSanh().compareTo(o2.getSoSanh()) < 0) return -1;
                return 1;
            }
        });
        for(int i = 0; i < m; i++) {
            System.out.println(sv[i]);
        }
    }
}
