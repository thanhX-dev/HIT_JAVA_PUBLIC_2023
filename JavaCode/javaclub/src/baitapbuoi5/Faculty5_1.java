package baitapbuoi5;

import java.util.Scanner;

public class Faculty5_1 {
    private String Name;
    private String Date;
    private School5_1 x;
    
    public Faculty5_1(String Name, String Date, School5_1 School) {
    	this.Name = Name;
    	this.Date = Date;
    	this.x = School;
    }
    
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
    
    public Faculty5_1() {
    	x = new School5_1();
    }
    
    public School5_1 getX() {
    	return x;
    }
    public void setX(School5_1 School) {
    	this.x = School;
    }
    
    public void Nhap() {
    	Scanner sc=  new Scanner(System.in);
    	System.out.println("Nhap ten khoa: ");
    	Name = sc.nextLine();
    	System.out.println("Nhap ngay vao khoa: ");
    	Date = sc.nextLine(); 
    	x.Nhap();
    	sc.close();
    }
    
    public void Xuat() {
    	System.out.println("Ten khoa: " + Name);
    	System.out.println("Ngay vao khoa: " + Date);
    	x.Xuat();
    }
}
