/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceng113_labex_w6;

import java.util.Scanner;

/**
 *
 * @author murat
 */
//This program do some calculatiions
public class CENG113_PS3_Q2_d {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        int x = scan.nextInt();
        int result =1;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                x*=x;
            System.out.print(result + " ");

        }

    }

}
}