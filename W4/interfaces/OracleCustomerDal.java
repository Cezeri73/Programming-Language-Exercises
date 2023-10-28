/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author murat
 */
public class OracleCustomerDal implements ICustomerDal,IRepository {

    @Override
    public void Add() {
        System.out.println("Oracle Eklendi ");
        
    }

    @Override
    public void repo() {
        System.out.println("Repo olusturuldu");
    }
    
    
}
