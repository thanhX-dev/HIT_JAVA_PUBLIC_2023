package baitapbuoi2;

import java.util.Scanner;

public class Bai3buoi3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n; 
	do {
		System.out.println("Nhap kich thuoc xoan oc: ");
		n = sc.nextInt();
		
		if ( 1 > n || n >50) {
			System.out.println("Xin hay nhap lai!");
		}
	}while (1 > n || n >50);
	
	int h1 = 0 ; int h2 = n-1;
	int c1 = 0 ; int c2 = n-1;
	int v = 0;
	int a[][] = new int[n][n];
	
   while (h1 <= h2 && c1 <= c2) {
	for(int i=c1; i <= c2 ; i++) {
		v++;
		a[h1][i] = v;
	}
	  h1++;
	  
	 for (int i = h1 ; i <= h2 ; i++) {
		  v++;
		  a[i][c2] = v;
	  }
	  c2--;
	  
	  for (int i = c2 ; i>=c1 ; i--) {
		  v++;
		  a[h2][i]=v;
	  }
	  h2--;
	  
	  for (int i=h2 ; i >= h1 ; i--) {
		  v++;
		  a[i][c1] = v;
	  }
	  c1++;
   }
   
	System.out.println("ma tran xoan oc: ");
	for(int i=0; i<n ; i++) {
		for(int j = 0 ; j<n ; j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println("");
	}
	sc.close();
}
}
