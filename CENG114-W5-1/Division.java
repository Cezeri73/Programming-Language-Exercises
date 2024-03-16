/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muratkynr
 */
public class Division extends Operation {

    @Override
    double process(double a, double b) {
        return a / b;

    }

    @Override
    int process(int a, int b) {

        return a / b;

    }

    @Override
    public String toString() {
        return " /  ";
    }
}
