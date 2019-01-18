/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author VanTung
 */
public class bai59 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap n:");
       int n = input.nextInt();
       System.out.println("Nhap x:");
       int x = input.nextInt();
       int sum =0;
            for (int j = 1; j <=n; j++) {
                
                sum = (int) (sum + pow(x, j));
            }
        
        System.out.println("Sum = "+sum);
    }
}
