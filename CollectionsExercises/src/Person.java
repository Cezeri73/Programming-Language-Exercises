/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Person {
    private final String name ;
    private final String Surname ;
    private final int id ;
    
    
    public Person(String name , String Surname, int id ){
        
        this.name = name ;
        this.Surname= Surname;
        this.id=id;
    }

    
    @Override
    public String toString(){
        return (name +"--"+ Surname+"--"+ id);
    }
            
    @Override
    public boolean equals(Object o){
            
            if(this==o){
                return true ;
            }
            else{
                if(o instanceof Person){
                    Person person = (Person)o;
                    return Surname.equals(person.Surname) && name.equals(person.name);
                    
                }
                else{
                    return false ;
                }
            }
        
    }
    
    
    
}
