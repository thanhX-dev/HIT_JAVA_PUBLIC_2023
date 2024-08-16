package baitapbuoi5;

import java.util.Scanner;

public class Student5_1 {
     private String Name;
     private String Class;
     private double Score;
     private Faculty5_1 y;
     
     public Student5_1() {
    	 y = new Faculty5_1();
     }
     
     public Student5_1(String Name, String Class, Double Score, Faculty5_1 Faculty) {
    	 this.Name= Name;
    	 this.Class = Class;
    	 this.Score = Score;
    	 this.y = Faculty;
     }

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getclass() {
		return Class;
	}

	public void setclass(String Class) {
		this.Class = Class;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double Score) {
		this.Score = Score;
	}
     
	public Faculty5_1 getY() {
		return y;
	}
	
	public void setY(Faculty5_1 Faculty) {
		this.y = Faculty;
	}
     
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten hs: ");
		Name = sc.nextLine();
		System.out.println("Nhap lop: ");
		Class = sc.nextLine();
		System.out.println("Nhap diem: ");
		Score = sc.nextDouble();
		y.Nhap();
		sc.close();
	}
	
	public void Xuat() {
		System.out.println("Ten hs: " + Name);
		System.out.println("Lop: " + Class);
		System.out.println("Diem: " + Score);
		y.Xuat();
	}
}
