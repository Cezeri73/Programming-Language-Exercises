/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Sema","Kaynar",9));
        people.add(new Person("Viyan","Kaynar",18));
        people.add(new Person("Fırat","Kaynar",24));
        people.add(new Person("jiyan","Kaynar",27));
        
        
        //Burada remove işlemi için Person classında Equals metodunun
        //Override edilmesi gerekiyor 
        
        
        //Güzel şey şu ki ,
        //Double , Integer gibi classlar için Equals değiştirmeye geerek yok 
        //Ama iş Stringe gelirse Equals methodun override edilmesi gerekiyor 
        people.remove(new Person("Sema","Kaynar",9));
       
        
        
        
        System.out.println("İsim  Soyİsim  id");
        Iterator<Person> gezici =people.iterator();
        while(gezici.hasNext()){
            System.out.println(gezici.next());
        }
        
        
        
        //System.out.println("Person : " + people);
       
        
        
        
        List<Number> list = new Stack<>();
        list.add(5);
        list.add(37);
        list.add(-8);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

       // System.out.println(list.isEmpty());
       // System.out.println();

        //First Way to iterate over list
        //oldest way
        /*  for(int i=0 ;i<list.size();i++){
            
            System.out.println(list.get(i));
            //System.out.println(list.get(i).getClass().getName());
        }
        
        //For-each method
        for(Number number :list){
            System.out.println("ForEach Merthod to ");
            System.out.println(number);
        }
        
         */
 /* System.out.println("");
        System.out.println("Wtih Lambda Expression");
        list.forEach((number) -> System.out.println(number));

        Person person = new Person("murat", "Kaynar", 170048);
        Person person2 = new Person("jiyan", "Kaynar", 259);
        System.out.println(person.equals(person2));

        System.out.println("----Clear the list---");
        //list.clear();
        // System.out.println(list);
        list.set(2, 99);

        // System.out.println(list);
        Iterable<Number> iterable = list;
        iterable.forEach((number) -> System.out.println(number));

        System.out.println(list.get(0));
        
         */
        //ForEach with Stream 
        /* System.out.println("");
        System.out.println("with Stream");
        list.stream().forEach((number) -> System.out.println(number));
        
        
        System.out.println("-------------");
        
        //Using Iterator
        System.out.println("with Iterator ");
        Iterator<Number> Iterator = list.iterator();
       while(Iterator.hasNext()){
           Number number = Iterator.next();
           System.out.println(number);
       }
        
        
         */
 /*
        System.out.println(list);
        System.out.println(list2);
        
        Iterator<Integer> it1 = list2.iterator();
        while(it1.hasNext()){
            
            System.out.println(it1.next());
        }
       
         */
        //list2.forEach(value -> System.out.println(value));
    }

}
