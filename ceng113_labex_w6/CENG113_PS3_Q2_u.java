/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceng113_labex_w6;

/**
 *
 * @author murat
 */
import java.util.Scanner;

public class CENG113_PS3_Q2_u {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double y = 0;
        // int x ;

        int n = scan.nextInt();

        if (n >= 10) {
            for (double i = 0; i < n; i += 2) {
                y += i + 5.0;
                System.out.println(y);

            }
        } 
        if (n<10 && n>0) {

            for (double j = -n; j >= 0; j++) {
                y += -Math.pow(j, 2);
                System.out.println(y);
            }

        } 
        if (n < 0) {
            for (double k = -n; k < n; k++) {
                y += Math.abs(k + k / 3.0);
            }
            System.out.println(y);
        }

    }

}
