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
public class CEN113_PS3_Q2_k {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int grades1 = 0;
        int grades2 = 0;
        int grades3 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your section : ");
            int section = scan.nextInt();
            System.out.println("Enter your Grade: ");
            int grade = scan.nextInt();

            switch (section) {

                case 1:
                    num1++;
                    grades1 += grade;

                    break;
                case 2:
                    num2++;
                    grades2 += grade;
                    break;
                case 3:
                    num3++;
                    grades3 += grade;
                    break;
                    default:
                        System.out.println("wrong interval!!");
            
            

            }
        }
        double average = grades2/num2;
        System.out.println("The number of student in section 1 is : "+num1);
        
        System.out.println("The avarage of student in section 2 is : "+grades2);
       

    }
}
