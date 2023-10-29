
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author murat
 */
public class ceng113_labex_q10_g {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Fahrenheit: ");
        double f = scan.nextDouble();
        double c = (f - 32) / (5 / 9.0);
        if (c >= -40 && c < 0) {
            System.out.println("Very Cold");
        } else if (c >= 0 && c < 10) {
            System.out.println("Cold");
        } else if (c >= 10 && c < 20) {
            System.out.println("Normal");
        } else if (c >= 20 && c < 30) {
            System.out.println("Hot");
        } else if (c >= 30 && c < 50) {
            System.out.println("Very Hot");
        } else if (c >= 30 && c < 40) {
            System.out.println("Very Hot");
        } else {
            System.out.println("Out of Range!!");

        }

    }
}
