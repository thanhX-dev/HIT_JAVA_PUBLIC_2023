package baitapbuoi5;

import java.util.Scanner;

public class PhongMay5_2 {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private int n;
    private QuanLy5_2 x;
    private May5_2 y;
   
    public PhongMay5_2(){
    	x = new QuanLy5_2();
    	y = new May5_2();
    }
    
    public PhongMay5_2(String MaPhong, String TenPhong, double DienTich, int n, QuanLy5_2 QuanLy, May5_2 May) {
          this.MaPhong = MaPhong;
          this.TenPhong = TenPhong;
          this.DienTich = DienTich;
          this.n = n;
          this.y = May;
          this.x = QuanLy;
    }
    
    public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String MaPhong) {
		this.MaPhong = MaPhong;
	}

	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String TenPhong) {
		this.TenPhong = TenPhong;
	}

	public double getDienTich() {
		return DienTich;
	}
	public void setDienTich(double DienTich) {
		this.DienTich = DienTich;
	}

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	public QuanLy5_2 getX() {
		return x;
	}
	public void setX(QuanLy5_2 QuanLy) {
		this.x = QuanLy;
	}
	 
	public May5_2 getY() { 
		return y;
	}
	public void setY(May5_2 May) {
		this.y = May;
	}
	
	public void Nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap ma phong: ");
    	MaPhong = sc.nextLine();
    	System.out.println("Nhap ten phong: ");
    	TenPhong = sc.nextLine();
    	System.out.println("Nhap dien tich: ");
    	DienTich = sc.nextDouble();
    	System.out.println("Nhap so luong may: ");
    	n = sc.nextInt();
    	x.Nhap();
    	y.Nhap();
    	sc.close();
    }
    
    public void Xuat() {
    	System.out.println("Ma phong: " + MaPhong);
    	System.out.println("Ten phong: " + TenPhong);
    	System.out.println("Dien tich: " + DienTich);
    	System.out.println("So luong may: " + n);
    	x.Xuat();
    	y.Xuat();
    }
}
