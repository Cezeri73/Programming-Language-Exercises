/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Kasa {
    private String model;
    private String Malzeme ;

    public Kasa(String model, String Malzeme) {
        this.model = model;
        this.Malzeme = Malzeme;
    }
    public void bilgisayari_ac(){
        System.out.println("Bilgisayar Acıldı ");
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the Malzeme
     */
    public String getMalzeme() {
        return Malzeme;
    }

    /**
     * @param Malzeme the Malzeme to set
     */
    public void setMalzeme(String Malzeme) {
        this.Malzeme = Malzeme;
    }
    
    
    
}
