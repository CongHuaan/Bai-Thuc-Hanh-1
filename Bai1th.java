
import java.time.format.ResolverStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Bai1th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++) {
            String n = sc.nextLine();
            char a[] = new char[n.length()];
            int sum = 0;
            for(int j = 0; j < n.length(); j++) {
                if(n.charAt(j) <= 'Z' && n.charAt(j) >= 'A') {
                    a[j] = (n.charAt(j));
                }
                else {
                    sum += Integer.parseInt(n.charAt(j) + "");
                }
            }
            Arrays.sort(a);
            String word = "";
            for(char j : a) {
                word += j;
            }
            word = word.trim();
            System.out.println(word + "" + sum);
        }
    }
}
