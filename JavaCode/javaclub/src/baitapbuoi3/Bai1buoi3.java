package baitapbuoi3;

import java.util.*;

public class Bai1buoi3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String type1 = "Square";
	String type2 = "Triangle";
	String type3 = "Circle";
	
	System.out.println("Nhap hinh dang: ");
	String typeName =  sc.nextLine();

	if (typeName.equals(type1) || typeName.equals(type2) || typeName.equals(type3)) {
		if (typeName.equals(type1)) {
			System.out.println("nhap canh: ");
			int a = sc.nextInt();
			System.out.println("dien tich cua vien gach: " + Math.pow(a,2));
		}else if(typeName.equals(type2)){
			System.out.println("nhap cac canh: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int p = (a+b+c)/2;
			double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("dien tich cua vien gach: " + s);
		}else {
			System.out.println("nhap ban kinh: ");
			int r = sc.nextInt();
			double s = Math.PI * Math.pow(r,2);
			System.out.print("dien tich cua vien gach: " );
			System.out.printf("%.2f", s );
		}
	}else {
		System.out.println("Hinh dang khong hop le!");
	}
	
	sc.close();
}
}
