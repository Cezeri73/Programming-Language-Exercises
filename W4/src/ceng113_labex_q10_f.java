/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class ceng113_labex_q10_f {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int decibel = scan.nextInt();

        if (decibel > 110) {
            System.out.println("UnComfortable");
        } else if (decibel > 91 && decibel <= 100) {
            System.out.println("Very Annoying");
        }
        else if (decibel > 71 && decibel <= 90) {
            System.out.println("Very Annoying");
        }
        else if (decibel > 51 && decibel <=70) {
            System.out.println("Very Annoying");
        }
        else if (decibel <=50) {
            System.out.println("Very Annoying");
        }

    }

}
