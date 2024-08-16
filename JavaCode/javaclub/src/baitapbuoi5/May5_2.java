package baitapbuoi5;

import java.util.Scanner;

public class May5_2 {
   private String MaMay;
   private String TenMay;
   private String TinhTrang;
   
   public May5_2() {
	   
   }
   
   public May5_2(String MaMay, String TenMay, String TinhTrang) {
	   this.MaMay = MaMay;
	   this.TenMay = TenMay;
	   this.TinhTrang = TinhTrang;
   }
   public String getMa() {
	   return MaMay;
   }
   public void setMa(String MaMay) {
	   this.MaMay = MaMay;
   }
   public String getTen() {
	   return TenMay;
   }
   public void setTen(String TenMay) {
	   this.TenMay = TenMay;
   }
   public String getTt() {
	   return TinhTrang;
   }
   public void setTt(String TinhTrang) {
	   this.TinhTrang =TinhTrang;
   }
   
   public void Nhap() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Nhap ma may: ");
	   MaMay = sc.nextLine();
	   System.out.println("Nhap ten may: ");
	   TenMay = sc.nextLine();
	   System.out.println("Nhap tinh trang: ");
	   TinhTrang = sc.nextLine(); 
	   
   }
   
   public void Xuat() {
	   System.out.println("Ma may: " + MaMay);
	   System.out.println("Ten may: " + TenMay);
	   System.out.println("Tinh Trang: " + TinhTrang);
   }
}
