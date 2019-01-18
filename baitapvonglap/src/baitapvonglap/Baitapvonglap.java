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
public class Baitapvonglap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao he so:");
        System.out.print("a=: ");
        float a = input.nextInt();
        System.out.print("b=: ");
        float b = input.nextInt();
        System.out.print("c=: ");
        float c = input.nextInt();
        float d = b*b-4*a*c;
        if (d==0){
            System.out.println("PT co nghiem kep x1 = x2 = :"+(-b/(2*a)));
        }if (d<0){
            System.out.println("PT vo nghiem:");
        }if (d>0){
            System.out.println("PT co 2 nghiem phan biet");
            System.out.println("x1=:"+(-b+sqrt(d))/(2*a));
            System.out.println("x2=:"+(-b-sqrt(d))/(2*a));
        }
    }
    
}
