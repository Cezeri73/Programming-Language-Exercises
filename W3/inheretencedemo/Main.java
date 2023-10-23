/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheretencedemo;

/**
 *
 * @author murat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
       // ogretmenKrediManager.Hesapla();
       KrediUI krediUI =new KrediUI();
       krediUI.KrediHesapla(new AskerKrediManager());
    }
    
}
