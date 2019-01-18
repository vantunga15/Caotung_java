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
public class bai7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        int a = 0;
        int b=0;
        int c=1;
        System.out.println(n+" so fibonaci dau tien la:");
        System.out.print("0 1");
        for (int i = 3; i <= n; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print(" "+c);
        }
    }
}
