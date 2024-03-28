/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Kopek  extends Hayvan{
    
    public Kopek(String isim, int kilo, int boy, int bacak_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
    }
    
    public void kos (int hız){
        super.harekete_gec(hız);
        System.out.println("kOPEK "+ hız + " hızıyla kosuyor");
        
    }
    @Override
    public void ses_cıkar() {
        System.out.println("hav hav hav ");
    }

}
