/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class ceng113_labex_q10_a {

    public static void main(String[] args) {
        int numSquare, numCube;
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num > 0) {
            numSquare = num * num;
        } else {
            numSquare = (int) Math.pow(num, 3);
        }

    }

}
