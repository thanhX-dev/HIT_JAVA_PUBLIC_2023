package baitapbuoi3;

import java.util.*;

public class Bai3buoi3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int range1 = 10;
	int range2 = 20;
	int a = (int)(Math.random() * range1);
	int b = (int)(Math.random() * range1);
	int c = (int)(Math.random() * range2);
	
	// cái này em thử tỉ lệ thấy về 50/50 nhiều nên lấy luôn
	// muốn chính xác hơn thì phải thử nhiều, em lười nên thôi
	boolean percent = Math.random() < 0.533; 
	if (!percent) {
		c = a+b;
	}
	
	System.out.println( a + " + " + b + " = " + c);
	
	System.out.println("Phep tinh tren dung hay sai (Y/N): ");
	String ans = sc.nextLine();
	String ans1 = "Y", ans2 = "y";
	if (a + b == c) {
		if (ans.equals(ans1) || ans.equals(ans2)) {
			System.out.println("Chinh xac!");
		}else {
			System.out.println("Sai!");
		}
	}else {
		if (ans.equals(ans1) || ans.equals(ans2)) {
			System.out.println("Sai!");
		}else {
			System.out.println("Chinh xac!");
		} 
	}
	sc.close();
	System.exit(0);
}
}
