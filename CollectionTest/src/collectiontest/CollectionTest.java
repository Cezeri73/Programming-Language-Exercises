/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectiontest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author muratkynr
 */
public class CollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(-2);
        System.out.println(queue);      
        queue.remove();
       
        System.out.println(queue);
        
       /* Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        while (!stack.isEmpty()) {

            Integer n = stack.pop();
        }
        System.out.println(stack);
        
        */
        /*  List <Number> list = new Stack<>();
        list.add(5);
        list.add(6);
        list.add(99);
        list.add(55);?/
        
        
        
      /*  Iterator <Number>  iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            
        }
        System.out.println("End of the Iterator"); */
        // double sum = 0.0;

        /* for(Number n : list){
            
                
                sum+= n.doubleValue();
                System.out.println(n);
                
            
            
        }
        System.out.println("---------");
        System.out.println(sum);   */
        // list.remove(new Integer(5));
    }

}
