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
public class bai6 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap a:");
       int a = input.nextInt();
       System.out.println("Nhap b:");
       int b = input.nextInt();
       int x=a;
       int y=b;
        while (x != y) {            
            if (x>y){
                x-=y;
            }else{
                y-=x;
            }
        }
        int ucln = x;
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+ucln);
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+(a*b)/ucln);
    }
}
