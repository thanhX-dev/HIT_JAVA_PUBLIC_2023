package baitapbuoi4;

import java.util.*;

public class Main {
//	public static void themSv() {
//		 Scanner sc = new Scanner(System.in);
//		 Student st = new Student();
//		 System.out.println("nhap thong tin hoc sinh moi: ");
//		 String name, adr;
//    	 int year, vang;
//    	 double t1, t2, kthp;
//		 name = sc.next();
//		 adr = sc.next();
//		 year = sc.nextInt();
//		 t1 = sc.nextDouble();
//		 t2 = sc.nextDouble();
//		 kthp = sc.nextDouble();
//		 vang = sc.nextInt();
//		 
//		 Student st6 = st.nhapTTin(name, adr, year,t1, t2, kthp, vang);
//		 sc.close();
//	 }
	
//	 public static void suaSv() {
//		 
//	 }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 Student st = new Student();
    	 Student st1 = st.nhapTTin("thanh", " Hai Duong", 2005, 6, 7, 8, 0);
    	 Student st2 = st.nhapTTin("thanh1", "Hai Duong", 2005, 6.1, 7.1, 8.1, 1);
    	 Student st3 = st.nhapTTin("thanh2", "Hai Duong", 2005, 6.2, 7.2, 8.2, 2);
    	 Student st4 = st.nhapTTin("thanh3", "Hai Duong", 2005, 6.3, 7.3, 8.3, 3);
    	 Student st5 = st.nhapTTin("thanh4", "Hai Duong", 2005, 6.4, 7.4, 8.4, 4);
    	 
    	 System.out.println(" Tên " + " Tuổi " + " Địa chỉ "  + " Điểm TX1 " + " Điểm TX2 " + " Điểm KTH " + " Điểm GPA  " + " Số tiết nghỉ ");
    	 st.xuatTTin(st1);
         System.out.println();
    	 st.xuatTTin(st2);
    	 System.out.println();
    	 st.xuatTTin(st3);
    	 System.out.println();
    	 st.xuatTTin(st4);
    	 System.out.println();
    	 st.xuatTTin(st5);
    	 
    	 int choose;
    	 do {
         System.out.println("\n---------------------------------MENU---------------------------------\n 1. thêm sinh viên mới \n 2.Sửa thông tin sinh viên \n 3.Sắp xếp sinh viên theo tuổi \n 4.Sắp xếp sinh viên theo GPA \n 5.Sắp xếp sinh viên theo Số tiết nghỉ \n 6. xóa sinh viên khỏi danh sách");
         System.out.println("---------------------------------END----------------------------------");
         System.out.println("Nhap lua chon: ");
    	 choose = sc.nextInt();
    	 }while (choose >6 || choose<1 );
    	 
//    	 if(choose == 1) {
//         System.out.println("nhap thong tin hoc sinh moi: ");
//		 String name1; String adr1;
//    	 int year1, vang1;
//    	 double t11, t21, kthp1; 
//    	 System.out.println("nhap ten: "); 
//		 name1 = sc.nextLine();
//		 sc.next();
//		 System.out.println("nhap dia chi: ");
//		 adr1 = sc.nextLine();
//		 sc.nextLine();
//		 System.out.println("nhap nam: ");
//		 year1 = sc.nextInt();
//		 System.out.println("nhap d1: ");
//		 t11 = sc.nextDouble();
//		 System.out.println("nhap d2: ");
//		 t21 = sc.nextDouble();
//		 System.out.println("nhap dhp: ");
//		 kthp1 = sc.nextDouble();
//		 System.out.println("nhap vang: ");
//		 vang1 = sc.nextInt();
//		 
//		 Student st6 = st.nhapTTin(name1, adr1, year1,t11, t21, kthp1, vang1);
//		 st.xuatTTin(st6);
//    	 }
    	 if(choose == 2) {
    		 int a  = sc.nextInt();
    		 
    		 st1 = st.nhapTTin("thanh", "hai duong",a , 6, 7, 8, 0);
    		 st.xuatTTin(st1);
    	 }
//    	 if(choose == 3)
//    		 tuoiSv(st);
//    	 if(choose == 4)
//    		 gpaSv(st);
//    	 if(choose == 5)
//    		 nghiSv(st);
//    	 if(choose == 6)
//    		 xoaSv(st);
    		sc.close(); 
	}
}
