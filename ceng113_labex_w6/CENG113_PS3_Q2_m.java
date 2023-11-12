/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceng113_labex_w6;

/**
 *
 * @author murat
 */
import java.util.Scanner;

public class CENG113_PS3_Q2_m {

    final static double EKS = 10/100.0;
    final static double EKS2 = 8/100.0;
    final static double EKS3 = 5/100.0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salary, id;
        System.out.println("Please Enter The numbers of Workers ");
        int numOfWorkers = scan.nextInt();

        for (int i = 0; i < numOfWorkers; i++) {
            System.out.println("Please Enter your Salary");
            salary = scan.nextDouble();
            System.out.println("Plese Enter your ID : ");
            id = scan.nextInt();

            if (salary < 500) {
                salary = salary+salary * EKS - salary * EKS3;
                System.out.println("The ID :  " + id + " salary is : " + salary);
                break ;
            }
            if(salary>500){
                salary=  (salary+salary*EKS2 -salary*EKS3) ;
            System.out.println("The ID : " +id + " Takes : " +salary );

        }

    }
        scan.close();

}
}