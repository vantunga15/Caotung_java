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
public class bai51 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap n:");
       float n = input.nextFloat();
       float sum = 0;
       for (float i = 1; i <=n ; i++) {
           sum = sum + (1/i);
       }
       System.out.println("Sum = "+sum);
   }
}
