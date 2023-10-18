/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W3;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class JavaArthmtcOperations {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
        //Here there will be codes for Arithmteic Operations
        int a = 2, b = 5,  c = 2, d = -1 , x=1, y =1;
        double resulta, resultb, resultc, resultd, resulte;

       /*resulta = Math.pow(a, 3) + Math.pow(a - (2 * b / a + b), 2);
        resultb = Math.sqrt(a) * 1 / 2 + Math.pow(b, 2) * (a - 1) / (a + 1);
        resultc = (a + b) + (3 * a * a * d) / (b + (c / d - a)) - c;
        resultd = a+b - (1-Math.abs(a))/(1+b)+ Math.pow(a-2*b, 5) ;
        resulte = (x+1) / ((y-2*x*y)*Math.abs(1-x*Math.pow(y, 10)) );*/
        resulta=((25/20-0.5)*3+4)/100*2 ;
        resultb= (100/5/2) + (2*6/5*100.0) ;
        resultc = 4/(3+1/(5-7/3-2));
        resultd = 3.0*(3+5/3)/(5*3.0/2+11/2.0) ;
        resulte = 5*0.2/(3.0+(5-3.0)/2)-7/5+3.0 ;
       
        System.out.println("The Result of A : "+resulta);
        System.out.println("The Result of B : "+resultb);
        System.out.println("The Result of C : "+resultc);
        System.out.println("The Result of D : "+resultd);
        System.out.println("The Result of E : "+resulte);

        
        

    }

}
