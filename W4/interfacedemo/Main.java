/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author murat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Worker worker =new Worker();
        worker.eat();
        worker.pay();
        worker.work();
        Robot robot =new Robot();
        robot.work();
        
        // TODO code application logic here
    }
    
}
