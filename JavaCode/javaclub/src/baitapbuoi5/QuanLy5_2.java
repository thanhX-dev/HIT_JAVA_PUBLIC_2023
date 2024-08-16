package baitapbuoi5;

import java.util.Scanner;

public class QuanLy5_2 {
    private String MaQl;
    private String Name;
    
    public QuanLy5_2() {
    	
    }
    
    public QuanLy5_2(String MaQl, String Name) {
    	this.MaQl = MaQl;
    	this.Name = Name;
    }
    public String getMaQl() {
    	return MaQl;
    }
    public void setMql(String MaQl) {
    	this.MaQl = MaQl;
    }
    
    public String getTenql() {
    	return Name;
    }
    public void setTenql(String Name) {
    	this.Name = Name;
    }
    
    public void Nhap() {
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println("Nhap ma quanly: ");
 	   MaQl = sc.nextLine();
 	   System.out.println("Nhap ten quanly: ");
 	   Name = sc.nextLine();
    }
    
    public void Xuat() {
 	   System.out.println("Ma quanly: " + MaQl);
 	   System.out.println("Ten quanly: " + Name);
    }
}
