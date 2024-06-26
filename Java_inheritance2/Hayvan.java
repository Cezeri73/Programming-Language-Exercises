/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Hayvan {

    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;

    }

    public void yemek_ye() {
        System.out.println("Hayvan yemek yiyor ");
    }

    public void harekete_gec(int hız) {
        System.out.println("Hayvan " + hız + "ile ilerliyor");

    }
    public void ses_cıkar(){
        System.out.println(" sesim : ");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacak_sayisi
     */
    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    /**
     * @param bacak_sayisi the bacak_sayisi to set
     */
    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

}
