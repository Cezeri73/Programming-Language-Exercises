/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author murat
 */
public class Worker implements IWorkable, IEtable, IPayable {

    @Override
    public void work() {
        System.out.println("Şirketimiz de Çalışansınız , Hoşgeldiniz !");

    }

    @Override
    public void eat() {
        System.out.println("Şirketimizde yemek hakkınız var !");

    }

    @Override
    public void pay() {
        System.out.println("Ödemeleriniz Her ayın 15 in de olacak.");

    }

}
