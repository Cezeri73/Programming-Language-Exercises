

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author murat
 */
public class Ceng113_labex_q10_d {
    
    public static void main(String[] args) {
        
        int id, bill;
        double discount = 0.05, pay=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter yur İD and bill : \n");
        id = scan.nextInt();
        bill = scan.nextInt();

        if (bill > 100) {
            pay = bill - bill * discount;
            System.err.println("The Customer with ID : "+id + " Will pay : "+pay+"  $");
        }
        else{
            pay = bill ;
        System.err.println("The Customer with ID : "+id + " Will pay : "+pay+"  $");
    }

}}
