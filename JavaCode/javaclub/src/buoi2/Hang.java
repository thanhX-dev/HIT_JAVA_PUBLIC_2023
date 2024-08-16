package buoi2;

import java.util.Scanner;

public class Hang {
   private String MaHang;
   private String TenHang;
   private Nsx x;
   
   public Hang(){
	   x = new Nsx();
   }
   
   public Hang(String maHang, String tenHang, Nsx Nsx) {
       this.MaHang = MaHang;
       this.TenHang = TenHang;
       this.x = Nsx;
   }
   
   
   public String getMaHang() {
	return MaHang;
}

public void setMaHang(String maHang) {
	MaHang = maHang;
}

public String getTenHang() {
	return TenHang;
}

public void setTenHang(String tenHang) {
	TenHang = tenHang;
}

public Nsx getX() {
	return x;
}

public void setX(Nsx Nsx) {
	this.x = Nsx;
}

public void Nhap() {
   	Scanner sc = new Scanner(System.in);
   	System.out.println("Nhap thong tin Hang:");
   	System.out.println("Nhap mahang: ");
   	MaHang = sc.nextLine();
   	System.out.println("Nhap tenhang: ");
   	TenHang = sc.nextLine();sc.nextLine();
   	x.Nhap();
   }
   
   public void Xuat() {
   	System.out.println(MaHang + " " + TenHang );
   	x.Xuat();
   }
}
