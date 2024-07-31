package baitapbuoi3;

import java.util.*;

public class Bai2buoi3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap chuoi: ");
	String s = sc.nextLine();
	String s1 = "";
	for( int i = s.length() - 1 ; i >=0 ; i--) { 
		s1 = s1 + s.charAt(i);
	}

	if (s.equals(s1)) {
		System.out.println("chuoi doi xung! ");
		System.out.println(s.toUpperCase());
	}else {
		System.out.println("chuoi ko doi xung! ");
		System.out.println(s.toLowerCase());
	}

	sc.close();
}
}
