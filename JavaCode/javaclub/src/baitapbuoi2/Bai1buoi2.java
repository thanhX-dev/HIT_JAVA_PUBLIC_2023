package baitapbuoi2;

import java.util.Scanner;

public class Bai1buoi2 {
   public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	float r;
	
	do {
		System.out.println("Nhap ban kinh: ");
		r = sc.nextFloat();
		
		if ( 0 >= r || r >= 1000) {
			System.out.println("Xin hay nhap lai!");
		}
	}while (0 >= r || r >= 1000);
	
	double c = 2 * r * Math.PI;
	double s = Math.PI * Math.pow(r,2);
	
	System.out.format("%.3f", c);
	System.out.print(" ");
	System.out.format("%.3f", s);
	
	sc.close();
}
}
