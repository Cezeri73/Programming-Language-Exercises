/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mÏÏuratkynr
 */
public class W5TestJava {

    public static void main(String[] args) {

        Operation ops[] = {new Division(), new Multiplication(), new Addition()};
        double[] op1 = {2, 3, 4, 5};
        double[] op2 = {4, 5, 6, 7};

        for (Operation op : ops) {
            for (int i = 0; i < op1.length; i++) {
                 double v1 = op1[i];
                 double v2 = op2[i];
                 System.out.println(v1 + op.toString() +" ="+ op.process(v1, v2));
            }
            System.out.println();

        }

    }
}
