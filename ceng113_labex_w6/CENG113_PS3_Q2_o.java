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

public class CENG113_PS3_Q2_o {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Number of Students");
        int NumOfStudent = scan.nextInt();

        char gender;
        int males = 0, females = 0;
        for (int i = 0; i < NumOfStudent; i++) {
            System.out.println("Please Enter Student Gender");
            gender = scan.next().charAt(0);

            if (gender == 'M' || gender == 'm') {
                males++;
            }
            if (gender == 'F' || gender == 'f') {
                females++;
            }

        }
        System.out.println("The number of Females : "+females+ "\nThe number of Males are : "+ males);
    }
}
