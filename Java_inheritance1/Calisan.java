/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Calisan {
    private String isim ;
    private  int maas ;
    private  String department ;

    public Calisan(String isim, int maas, String Department) {
        this.isim = isim;
        this.maas = maas;
        this.department = Department;
    }
    
    public void calis(){
        System.out.println("calısan calsıyor");
    }
    public void bilgileriGoster(){
        
        System.out.println("İsim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("department : "+ getDepartment());
        
    }
    
    public void departmani_degistir(String yeniDepartman){
        
        this.setDepartment(yeniDepartman);
        System.out.println("Yeni departmanınız " + yeniDepartman + "olarak güncellendi");
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
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
