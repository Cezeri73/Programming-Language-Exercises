/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colllectionsexercises2;

/**
 *
 * @author muratkynr
 */
public class Person implements Comparable<Person>{

    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    String FullName(){
        return  name +" "+surname ;
    }
    public int compareTo(Person person) {
       return age - person.age ;
    }

    @Override
    public String toString() {

        return name + " " + surname + " " + "("  + age+ ")";
    }

    @Override
    public int hashCode(){
        return toString().hashCode();
    }
    
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;

        } else {
            if (o instanceof Person) {
                Person person =(Person)o;
               return name.equals(person.name)  && surname.equals(person.surname) && age==person.age;
               
            }
            else 
                return false;

        }}
    
    
    
    
    
    
    //Karşılaştırma için aslında 2 yol var gibi 
    
    //birisi Comparable implement etmek , sonra CompareTo yu override edicez (CompareTo(Person p1)
    //İkincisi de Comparator sınıfını implement etmek ve Comparator interface sini Collections.sort içinde kullanmak (Override Compare(Person p1,Person p2))
    

    

   
}