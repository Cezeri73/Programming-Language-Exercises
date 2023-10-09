/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1;

/**
 *
 * @author murat
 */
import java.util.Scanner ;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Please Enter a Number to Check whetter it is Perfect Number or not : ");
        int sayi = scn.nextInt();
        
        
        
        int sum=0;
        for(int i =1 ;i<sayi;i++){
            if(sayi%i ==0){
                sum+=i ;
            }
            
        }
        if(sum==sayi){
            System.out.println("The Number is Perfect Number");
        }
        else
            System.out.println("The Number is not Perfect Number");
                
    }
    
}
