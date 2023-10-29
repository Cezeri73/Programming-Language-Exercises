
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author murat
 */
public class ceng113_labex_q2_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please Enter the value of a and b ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(a + b);
        } else if (a > 0 && b < 0) {
            System.out.println(a);
        } else if (a < 0 && b > 0) {
            System.out.println(b);

        }else if(a<0 && b<0)
            System.out.println(a*b);

    }
}
