/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınheretenceexp;

/**
 *
 * @author murat
 */
public class InheretenceMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        employee.age = 15;
        employee.firstname = "Murat";
        employee.lastname = "Kaynar";
        employee.salary = 50000;
        employee.age = 28;

        customer.age = 40;
        customer.email = "xyz@hotmail.com";
        customer.firstname = "Harun";
        customer.lastname = "Esen";
        customer.id = 1;

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        customerManager.List();
        customerManager.Add();
        customerManager.Delete();
        employeeManager.Add();
        employeeManager.Delete();

        // System.out.println(customer.firstname +" "+customer.l);
        // TODO code application logic here
    }

}
