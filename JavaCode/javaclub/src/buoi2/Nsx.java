package buoi2;

import java.util.Scanner;

public class Nsx {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    
    public Nsx() {
    	
    }
    
    public Nsx(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }
    
    public String getMaNSX() {
		return MaNSX;
	}

	public void setMaNSX(String MaNSX) {
		this.MaNSX = MaNSX;
	}

	public String getTenNSX() {
		return TenNSX;
	}

	public void setTenNSX(String TenNSX) {
		this.TenNSX = TenNSX;
	}

	public String getDcNSX() {
		return DcNSX;
	}

	public void setDcNSX(String DcNSX) {
		this.DcNSX = DcNSX;
	}

	public void Nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap thong tin Nsx:");
    	System.out.println("Nhap mansx: ");
    	MaNSX = sc.nextLine();
    	System.out.println("Nhap tennsx: ");
    	TenNSX = sc.nextLine();sc.nextLine();
    	System.out.println("Nhap dcnsx: ");
    	DcNSX = sc.nextLine();sc.nextLine();
    }
    
    public void Xuat() {
    	System.out.println(MaNSX + " " + TenNSX + " "+ DcNSX);
    }
}