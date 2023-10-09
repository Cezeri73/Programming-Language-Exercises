/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1;

/**
 *
 * @author murat
 */
public class Arr1 {

    public static void main(String[] args) {
        //  Scanner scn = new Scanner(System.in);
        String[] arr = new String[6];
        arr[0] = "Murat";
        arr[1] = "Melih";
        arr[2] = "Abdulkadir ";
        arr[3] = "Kadir";
        arr[4] = "Enes";
        arr[5] = "Zakir";

        /* for(int i=0 ;i<arr.length ;i++){
            System.out.println((i+1) +". Ögrenci : " + arr[i]);  */
        for (String ogrenci : arr) {
            System.out.println(ogrenci);
        }

    }
}
