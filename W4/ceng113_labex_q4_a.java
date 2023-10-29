
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author murat
 */
public class ceng113_labex_q4_a {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please Enter the value of x and Grade :");
        int x = scn.nextInt();
        int grade = scn.nextInt();
        if (x < 5 && x > 2) {
            int y = x + 1;
        }
        if (grade < 50) {
            System.out.println(" Your Grade is under 50 so ....\nThe Result :Unseccesfull");
        }

        if (grade > 80 && grade <= 90) {
            System.out.println(grade);
        }

    }
}
