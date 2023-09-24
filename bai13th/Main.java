/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> sj = new ArrayList<>();
        while(sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            sj.add(new Subject(id,name,type));
        }
        for(int i = 0; i < sj.size() - 1; i++) {
            for(int j = i + 1; j < sj.size(); j++) {
                if(sj.get(i).getId().equals(sj.get(j).getId())) {
                    sj.get(j).setNote(-1);
                    
                }
            }
        }
        Collections.sort(sj, new Comparator<Subject>(
        ) {
            @Override
            public int compare(Subject o1, Subject o2) {
                if(o1.getId().compareTo(o2.getId()) < 0) return -1;
                return 1;
            }
        });
        for(Subject i : sj) {
            if(i.getNote() == 0)
            System.out.println(i);
        }
    }
}
