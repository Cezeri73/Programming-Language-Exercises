
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author murat
 */
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class AsalMi {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int böl=0;
		
		System.out.println("Lütfen bir sayı giriniz ");
		int sayi = scn.nextInt();
		
		for(int i =1; i<=sayi;i++) {
			if(sayi%i==0)
				böl++;
		}
		if(böl==2)
			System.out.println("asaldir");
		else
			System.out.println("asal degil");
		scn.close();
	}

}


