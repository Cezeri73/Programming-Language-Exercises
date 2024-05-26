/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colllectionsexercises2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author muratkynr
 */
public class ColllectionsExercises2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        queue.add(400);
        queue.add(100);
        queue.add(2);
        queue.add(30);
        
      
      
        for(Integer x : queue){
            System.out.println(x);
        }
         */

 /*  List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(-5);
       
       
        
        
        System.out.println("list : " + list );
        
        Collections.sort(list);
        
        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println(list);
        
        
         */
 /*
        List<Person> ailem = new ArrayList<>();
        ailem.add(new Person("SemaNur", "Kaynar", 8));
        ailem.add(new Person("Murat", "Kaynar", 28));
        ailem.add(new Person("Jiyan", "Kaynar", 26));
        ailem.add(new Person("Rojda", "Kaynar", 24));
        ailem.add(new Person("Fırat", "Kaynar", 23));
        ailem.add(new Person("Abdullah", "Kaynar", 54));
        ailem.add(new Person("Viyan", "Kaynar", 18));
        ailem.add(new Person("Halime", "Kaynar", 48));

        
        System.out.println("The Size of Family : " + ailem.size());
        System.out.println("----------------------");
        //Collections.sort(ailem);
        Collections.sort(ailem, (p1, p2) -> p1.age - p2.age);
        ailem.forEach((person) -> System.out.println(person));

 
         */
 /* Set<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(5);
        set.add(-7);
        set.add(12);
        
         */
 /* Set<Person> ailem2 = new HashSet<>();
        ailem2.add(new Person("SemaNur", "Kaynar", 8));
        ailem2.add(new Person("Murat", "Kaynar", 28));
        ailem2.add(new Person("Jiyan", "Kaynar", 26));
        ailem2.add(new Person("Rojda", "Kaynar", 25));
        ailem2.add(new Person("Fırat", "Kaynar", 23));
        ailem2.add(new Person("Abdullah", "Kaynar", 54));
        ailem2.add(new Person("Viyan", "Kaynar", 18));
        ailem2.add(new Person("Halime", "Kaynar", 48));

        ailem2.forEach(x -> System.out.println(x));
        
         */
 /* Map<Integer,String> map=new TreeMap<>();
        
        map.put(1, "Bir");
        map.put(2, "iki");
        map.put(3, "üc");
        map.put(10, "on");
        map.put(7, "yedi");
        map.put(4, "dört");
        
        System.out.println(map);
        
         */
        Map<Person, String> map1 = new TreeMap<>();

        
        map1.put(new Person("Fatih", "Nar", 100), "Teacher");
        map1.put(new Person("NisanUR", "Mühürdaroğlu", 99), "Asistance1");
        map1.put(new Person("Cagin", "ateş", 98), "Asistance2");
         
        //System.out.println(map1.get(new Person("Fatih", "Nar", 100)));

        /*
        for (Map.Entry<Person, String> entry : map1.entrySet()) {

            System.out.println(entry.getKey() + " --> " + entry.getValue());

        }
        System.out.println("----------------------------");

        for (Person person : map1.keySet()) {
            System.out.println(person);
        }

        System.out.println("----------------------------");

        for (String value : map1.values()) {
            System.out.println(value);

        }
         */
        map1.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
