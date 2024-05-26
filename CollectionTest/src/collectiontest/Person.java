/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectiontest;

/**
 *
 * @author muratkynr
 */
public class Person {
    public final String name ;
    public final String surname;

    public Person() {
        this.name = null;
        this.surname = null;
    }
    
    

    @Override
    public String toString(){
    return name +"  " + surname ;
}
}
