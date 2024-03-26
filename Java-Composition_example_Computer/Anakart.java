/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Anakart {
    private String  model;
    private String yuvaSayisi ;
    private String os ;
    private String isletim_sistemi;
    
    public Anakart(String model,int yuvaSayisi,String os ){
        this.model =model ;
        this.yuvaSayisi =this.yuvaSayisi;
        this.os=os;
        
        
        
    }
    public void isletim_sistemi_yukle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("işletim sistemi yüklendi : "+ isletim_sistemi);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYuvaSayisi(String yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public String getYuvaSayisi() {
        return yuvaSayisi;
    }

    public String getOs() {
        return os;
    }
    
}
