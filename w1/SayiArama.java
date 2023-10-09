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
public class SayiArama {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int sayilar[] = {1, 5, 6, 8, 9, 7};

        Scanner scn = new Scanner(System.in);
        boolean flag;
        flag = false;

        System.out.println("Lütfen Aranacak sayiyi giriniz :");
        int aranan = scn.nextInt();

        for (int i = 0; i < sayilar.length; i++) {
            if (aranan == sayilar[i]) {
                flag = true;
                break;

            }
        }
        int i;

        if (flag) {
            System.out.println("Aranan sayi bulundu");
        } else {
            System.out.println("sayi bulunamadi");
        }
        scn.close();
    }

}
