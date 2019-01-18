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
public class bai512 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap n:");
       int n = input.nextInt();
       float sum1 =0;
       float sum2 =0;
        
            for (float j = 1; j <=n; j++) {
                sum2 = sum2 +j;
                sum1 = sum1 + (1/sum2);
            }
        
        System.out.println("Sum = "+sum1);
    }
}
