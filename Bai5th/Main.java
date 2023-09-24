/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5th;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Team te[] = new Team[n];
        for(int i = 0; i < n; i ++) {
            String name = sc.nextLine();
            String school = sc.nextLine();
            te[i] = new Team(i, name, school);
        }
        int m = sc.nextInt();
        sc.nextLine();
        ThiSinh ts[] = new ThiSinh[m];
        for(int j = 0; j < m; j++) {
            String ten = sc.nextLine();
            String team = sc.nextLine();
            ts[j] = new ThiSinh(j, ten, team);
        }
        Arrays.sort(ts, new Comparator<ThiSinh>(
        ) {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.getName().compareTo(o2.getName()) < 0) return -1;
                return 1;
            }
        });
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(ts[i].getTeam().equals(te[j].getId())) {
                    System.out.println(ts[i] + " " + te[j]);
                }
            }
        }
    }
}
