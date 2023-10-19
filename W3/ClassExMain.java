/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W3;

import java.util.Scanner;

/**
 *
 * @author murat
 */
public class ClassExMain {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Lütfen 2 sayi giriniz.....:");
        int x = scn.nextInt();
        int y = scn.nextInt();
        ClassExp calculator = new ClassExp();
        System.out.println("Toplam : " + calculator.Summation(x, y));
        System.out.println("Farklari : " + calculator.Substraction(x, y));
        System.out.println("Bölüm : " + (double)calculator.Division(x, y));
        System.out.println("Çarpım :" + (double)calculator.Division(x, y));
        

    }
    
}