/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6th;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Item it[] = new Item[t];
        for(int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            long price = sc.nextLong();
            long sl = sc.nextLong();
            sc.nextLine();
            it[i] = new Item(name, id, price, sl);
        }
        for(int i = 0; i < t; i++) {
            System.out.println(it[i]);
        }
    }
}
