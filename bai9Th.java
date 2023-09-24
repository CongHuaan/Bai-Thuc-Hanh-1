
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class bai9Th {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cot = sc.nextInt();
            int matr[][] = new int[102][102];
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    matr[j][k] = sc.nextInt();
                }
            }
            for(int j = 0; j < m; j++) {
                if(j == cot - 1) {
                    for(int k = 0; k < n - 1; k++) {
                        int min = k;
                        for(int l = k + 1; l < n; l++) {
                            if(matr[min][j] > matr[l][j]) {
                                min = l;
                            }
                        }
                        if(min != k) {
                            int tmp = matr[min][j];
                            matr[min][j] = matr[k][j];
                            matr[k][j] = tmp;
                        }
                    }
                }
            }
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    System.out.print(matr[j][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}
