package baitapbuoi5;

import java.util.Scanner;

public class School5_1 {
     private String Name;
     private String Date;
     
     public School5_1() {
    	 
     }
     
     public School5_1(String Name,String Date) {
    	 this.Name = Name;
    	 this.Date=Date;
     }
     public String getName() {
    	 return Name;
     }
     public void setName(String Name) {
    	 this.Name=Name;
     }
     
     public String Date() {
    	 return Date;
     }
     public void setDate(String Date) {
    	 this.Date=Date;
     }
     
     public void Nhap() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("nhap ten truong:");
    	 Name = sc.nextLine();
    	 System.out.println("nhap ngay vao truong: ");
    	 Date = sc.nextLine(); 
    	 sc.close();
     }
     
     public void Xuat() {
    	 System.out.println("Ten truong: " + Name);
    	 System.out.println("ngay vao truong: "+ Date);
     }
}
