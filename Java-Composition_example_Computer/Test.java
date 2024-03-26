/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("2024", "48", resolution);
        Kasa kasa = new Kasa("shadow blade", "Cam");
        Anakart anakart= new Anakart("b250pro", 10, "w10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getMonitor().MonitoruKapat();
        pc.getAnakart().isletim_sistemi_yukle("Linux");
        
    }
    
}
