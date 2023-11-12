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
;

public class CENG113_PS3_Q2_q {

    final static double INTEREST = 5/100.0 ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double TotalMoney, p, r;
        System.out.println("Please Enter the time (Years) : ");
        int n= scan.nextInt();

        System.out.println("Please Enter the original amount invested");
        p = scan.nextDouble();

        TotalMoney = p * Math.pow((1 + INTEREST), n);
        
        System.out.println("The total money is : "+TotalMoney);

    }
}
