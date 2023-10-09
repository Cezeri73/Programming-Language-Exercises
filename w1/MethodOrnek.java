/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1;

import java.util.Scanner;

/**
 *
 * @author murat
 */
public class MethodOrnek {

    public static void main(String[] args) {
        sayiAra();
    }
    
    public static void sayiAra() {
        int sayilar[] = {1, 5, 6, 8, 9, 7};

        try (Scanner scn = new Scanner(System.in)) {
            boolean flag;
            flag = false;
            
            System.out.println("Lütfen Aranacak sayiyi giriniz :");
            int aranan = scn.nextInt();
            
            for (int i = 0; i < sayilar.length; i++) {
                if (aranan == sayilar[i]) {
                    tebrikle();
                    flag = true;
                    break;
                    
                }
            }
            
            
            if (flag) {
                System.out.println("Aranan sayi bulundu");
            } else {
                System.out.println("sayi bulunamadi");
            }
        }
    }
    
    public static int tebrikle(){
        System.out.println("Sizi Tebrik ediyoruz ");
        return 1 ;
    }

}


