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
public class CENG113_PS3_Q2_t {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter number of terms : ");
       int N =scan.nextInt();
       
       int term1 =0 ;
       int term2 =1 ;
       int term3 ;
       if(N<=2){
           System.out.print(term1+" "+term2+" ");
       }
       else
           
           System.out.print(term1+" "+term2);
           
           for(int i=2 ; i<N;i++){
               
              
               term3 =term1+term2;
               term1 =term2 ;
               term2 =term3 ;
               
               
               System.out.print(" "+term3);
               
           
           
       }
       
    }
}
