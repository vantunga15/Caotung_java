/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvonglap;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author VanTung
 */
public class bai3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int d = n/2;
        
        for (int i = 2; i <=d ; i++) {
            if (n%i==0){
                System.out.println("day ko phai la snt");
                break;
            }else{
                System.out.println("day la snt");
            }
        
    }
}
}