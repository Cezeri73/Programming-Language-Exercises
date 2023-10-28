/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author murat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*    ICustomerDal ıCustomerDal = new SqlCustomerDal();
        ıCustomerDal.Add();

        IRepository ıRepository = new SqlCustomerDal();
        ıRepository.repo();

        */

    CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
   // customerManager.customerDal=new MySqlCustomerDal();
    customerManager.add();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
