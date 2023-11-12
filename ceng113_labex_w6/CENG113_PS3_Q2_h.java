/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceng113_labex_w6;

/**
 *
 * @author murat
 */
import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil;
import java.util.Scanner;

//This program find max and min among given 50 numbers
public class CENG113_PS3_Q2_h {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[50];

        for (int i = 0; i < 50; i++) {
            numbers[i]= scan.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < 50; i++) {
            if (min < numbers[i]) {
                min = numbers[i];
            }
            if (max > numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("THE min : " + min + " The Max " + max);
        
        scan.close();
    }

}
