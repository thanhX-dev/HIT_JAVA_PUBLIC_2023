package baitapbuoi2;

import java.util.Scanner;

public class Bai2buoi2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("nhap so phan tu: ");
	int n = sc.nextInt();
	int a[] = new int[n];
	
	System.out.println("nhap mang: ");
	for (int i=0; i<n ; i++) {
		a[i] = sc.nextInt();
	}
	
	System.out.println("duyet mang da nhap: ");
	for (int i=0; i<n ; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
	
	int tm1 = a[1];
	int tm2 = a[n-2];
	
	for (int i=1; i<n-1 ; i++) {
		if (a[i]%2 == 1) {
			a[i] = a[i] + Math.abs(a[i+1] - a[i-1]);
		}
	}
	
	if(a[0]%2 == 1) {
		a[0] = a[0] + tm1; 
	}
	if(a[n-1]%2 == 1) {
		a[n-1] = a[n-1] + tm2; 
	}
	
	System.out.println("mang sau khi bien doi: ");
	for (int i=0; i<n ; i++) {
		System.out.print(a[i] + " ");
	}
	sc.close();
 }
}
