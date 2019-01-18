/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap2;

import java.util.Scanner;

/**
 *
 * @author VanTung
 */
public class bai58 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap n:");
       int n = input.nextInt();
       int sum =0;
       int tich =1;
        
            for (int j = 1; j <=n; j++) {
                tich = tich*j;
                sum = sum + tich;
            }
        
        System.out.println("Sum = "+sum);
    }
}
