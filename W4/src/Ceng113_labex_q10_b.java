/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner ;

/**
 *
 * @author murat
 */
public class Ceng113_labex_q10_b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y ;
        int x = scn.nextInt();
        
        if(x<0)
            y=-x ;
        
        else if(x==0)
            y=0;
        else 
            y=(int)Math.pow(x, 2);
        
    }
    
}
