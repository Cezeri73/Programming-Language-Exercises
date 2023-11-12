package ceng113_labex_w6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author murat
 */
import java.util.Scanner;

public class CENG113_PS3_Q2_I {

    final static int PAY = 200;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int id, hours;
        double TotalPayOfWeek;

        System.out.println("Please Enter the Number of workers : ");
        int numWorkers = scan.nextInt();

        for (int i = 0; i < numWorkers; i++) {
            System.out.println("\n\t\tEnter The ID of Worker : ");
            id = scan.nextInt();
            System.out.println("Enter the hours that worker work : ");
            hours = scan.nextInt();
            TotalPayOfWeek = PAY + hours * 7.5;
            System.out.println("The pay for ID : " + id +" is "+ TotalPayOfWeek);

        }

    }

}
