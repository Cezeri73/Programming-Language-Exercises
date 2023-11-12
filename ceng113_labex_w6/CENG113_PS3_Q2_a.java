/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceng113_labex_w6;

import java.util.Scanner;

/**
 *
 * @author murat
 */
public class CENG113_PS3_Q2_a {

    public static void main(String[] args) {

        // This program find denstiy of substance acorring to given mass and volume . 
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Please Enter the mass of substance " + (1 + i));
            int mass = scan.nextInt();
            System.out.println("Please Enter the volume of substance " + (i + 1));
            int volume = scan.nextInt();
            double density = mass / 1000.0 / volume;
            if (density < 1) {
                System.out.println("This Substance will sink");
            } else {
                System.out.println("This Susbtance will float");
            }
        }

    }

}
