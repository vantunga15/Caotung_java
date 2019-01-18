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
public class bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = input.nextInt();
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua*i;
            
        }
        System.out.println("n! = :"+giaiThua);
    }
}
