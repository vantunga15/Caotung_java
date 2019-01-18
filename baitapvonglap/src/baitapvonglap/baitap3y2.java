/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap;


import java.util.Scanner;

/**
 *
 * @author VanTung
 */
public class baitap3y2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int i = 2;
        int dem = 0;
        while(dem<n){
            if (soNguyenTo(i)){
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
    public static boolean soNguyenTo(int t){
        if (t<2){
            return false;
        }
        int d = (int) Math.sqrt(t);
                for (int j = 2; j <= d; j++) {
            if (d%j == 0){
                return false;
            }
        }
                return true;
    }
}



