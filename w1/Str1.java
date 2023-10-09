/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1;

/**
 *
 * @author murat
 */
public class Str1 {

    public static void main(String[] args) {

        String mesaj = "   today the weather was so good         .";
        String regex = null;
        /*   
        System.out.println("Eleman sayisi : " + mesaj.length());
        System.out.println("5. Eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" but now it is cold ."));
        System.out.println(mesaj.startsWith("T"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5 , karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("as"));
        System.out.println(mesaj.lastIndexOf("d")); */
        // String yeniMesaj = mesaj.replace('' ,'-');
        //System.out.println(yeniMesaj);
        //System.out.println(mesaj.substring(2, 8));
        //for(String kelime : mesaj.split(regex: " ")){
        //  System.out.println(kelime);
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }

}
