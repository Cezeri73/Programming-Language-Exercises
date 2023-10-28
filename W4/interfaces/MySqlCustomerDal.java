/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author murat
 */
public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void Add() {
        System.out.println("My Sql Eklendi ");
    }
    
}
