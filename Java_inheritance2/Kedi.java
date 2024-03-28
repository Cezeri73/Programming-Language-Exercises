/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Kedi extends Hayvan{
    private int dis_sayisi ;
    public Kedi(String isim, int kilo, int boy, int bacak_sayisi,int dis_sayisi) {
        
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }
    public void kos(int hız){
        super.harekete_gec(hız);
        System.out.println("Kedi " + hız + "ile hızlanıyor ");
    }

    @Override
    public void ses_cıkar() {

        System.out.println("miyavvvv");
    }

    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
        System.out.println(dis_sayisi + " tane disi var ");
    }

    
    
  
    
 
    
}
