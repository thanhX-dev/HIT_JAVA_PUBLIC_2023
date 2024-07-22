package buoi2;

import java.util.Scanner;

public class Bt2 {
   public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("nhap so phan tu: ");
	int n = sc.nextInt();
	
	int a[]= new int[n];
	System.out.println("nhap mang: ");
	for (int i=0 ; i<n ;i++) {
		a[i] = sc.nextInt();
	}
	int amax = -99999;
	int amin = 99999;
	for (int i=0 ; i<n ;i++) {
		if(amax < a[i])
			amax =a[i];
	}
	for (int i=0 ; i<n ;i++) {
		if(amin > a[i]) {
			amin = a[i];
		}
	}
	int s = amax - amin;
	System.out.println("mang da nhap :");
	for (int i=0 ; i<n ;i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
	System.out.println("phan tu lon nhat: " + amax + '\n' + "kc lon nhat giua cac phan tu: " + s);
	sc.close();
}
}
