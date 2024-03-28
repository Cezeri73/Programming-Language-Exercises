/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Yonetici extends Calisan {

    private int sorumlu_kisi;  //ekstra özellik

    public Yonetici(String isim, int maas, String department, int sorumlu_kisi) {

       super(isim, maas, department);
        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void zam_yap(int zam) {

        System.out.println("Calisanlara " + zam + "$ Zam Yapıldı");
    }

    @Override
    public void bilgileriGoster() {
       super.bilgileriGoster();
        System.out.println(this.sorumlu_kisi + " kişiden sorumlu ");

    }

}

