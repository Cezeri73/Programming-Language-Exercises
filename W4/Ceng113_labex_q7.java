
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author murat
 */
public class Ceng113_labex_q7 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double z;
        double k = scn.nextDouble();
        double a = scn.nextDouble();

        if (a > 0 && k > 0) {
            a = a + k;
        } else if (k == 0) {
            z = a;
            a = k;
            k = z;
        } else if (a < 0) {
            a = a + 1;
        } else {
            k = k * 2;
        }
        System.out.print(a + "------" + k);
    }

}
