/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author murat
 */
public class ceng113_labex_q10_e {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please Enter Your ID ,consuption and the User Code (D or I \n");
        int id ,consuption,uCode;
        double paid ;
        id =scan.nextInt();
        consuption=scan.nextInt();
        uCode=scan.next().charAt(0);
        
        if(uCode=='d' || uCode=='D'){
            paid = consuption*3 ;
            System.out.println("Your id : "+id+" and the payment is : "+paid);
        }
        else if(uCode=='I' || uCode=='i'){
            paid = consuption*(2.5) ;
            System.out.println("Your id : "+id+" and the payment is : "+paid);
        }
        else
            System.out.println("you typed wrong letter !!");
       
        
        
    }

}
