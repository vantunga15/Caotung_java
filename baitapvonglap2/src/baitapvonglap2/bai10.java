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
public class bai10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so nguyen can kiem tra: ");
        String a=input.nextLine();
        StringBuilder stringBuffer = new StringBuilder(a);
		String b =  stringBuffer.reverse().toString();
		if(a == null ? b == null : a.equals(b)){
                    System.out.println(a+": khong la 1 palindrome");
                }else{
                    System.out.println(a+": la 1 palindrome");
                }
    }
}
