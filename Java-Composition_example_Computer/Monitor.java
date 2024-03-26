/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Monitor {
    private String model ;
    private String boyut ;
    private Resolution resolution;

    /**
     * @return the model
     */
    public void MonitoruKapat(){
        System.out.println("Monitor Kapatıldı .");
    }
    
    public String getModel() {
        return model;
    }

    public Monitor(String model, String boyut, Resolution resolution) {
        this.model = model;
        this.boyut = boyut;
        this.resolution = resolution;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
   
    
    
}
