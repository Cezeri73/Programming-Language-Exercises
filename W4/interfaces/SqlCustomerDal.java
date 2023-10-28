/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author murat
 */
public class SqlCustomerDal implements  ICustomerDal,IRepository{

    @Override
    public void Add() {
        System.out.println("Sql Eklendi");
    }

    /**
     *
     */
    @Override
    public void repo() {
        System.out.println("Repo Sql icin olusturuldu");
       
}}
