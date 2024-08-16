package baitapbuoi4;

public class Student {
      private String name, adr;
      private int year, vang;
      private double tx1, tx2, kthp,Gpa;
      
     
      public Student() {  
      }
      
      public Student(String name, String adr, int year, double tx1, double tx2, double kthp, int vang) {
    	  this.name = name;
    	  this.adr = adr;
    	  this.year = year;
    	  this.tx1 = tx1;
    	  this.tx2 = tx2;
    	  this.kthp = kthp;
    	  this.vang = vang;
      }
	
      public String getName() {
  		return name;
  	}
  	  public void setName(String name) {
  		this.name =name;
  	}
  	
  	  public String getAdr() {
  		return adr;
  	}
  	  public void setAdr(String adr) {
  		this.adr =adr;
  	}
  	  
      public int getYear() {
		return year;
	}
	  public void setYear(int year) {
		this.year =year;
	}
	
      public int getVang() {
		return vang;
	}
	  public void setVang(int vang) {
		this.vang = vang;
	}
	
      public double getTx1() {
		return tx1;
	}
	  public void setTx1(double tx1) {
		this.tx1 = tx1;
	}
	
      public double getTx2() {
		return tx2;
	}
      public void setTx2(double tx2) {
		this.tx2 = tx2;
	}
	
      public double getKthp() {
		return kthp;
	}
	  public void setKthp(double kthp) {
		this.kthp = kthp;
	}
     	  
	  public double getGpa() {
		  return (tx1*0.2 + tx2 * 0.3 + kthp* 0.5);
	  }
	  public void setGpa(double Gpa) {
		  this.Gpa= Gpa;
	  }
	  
	  public Student nhapTTin(String name, String adr, int year, double tx1, double tx2, double kthp, int vang ) {
		  Student st = new Student(name, adr, year, tx1, tx2, kthp,vang);
		  return st;
	  } 

	  public void xuatTTin(Student st) {
		  System.out.printf( st.getName() + "   " + (2024-st.getYear()) + "   " + st.getAdr()  + "   " + st.getTx1() + "   " 
	                         + st.getTx2() + "   " + st.getKthp() + "   " + st.getGpa() + "   " + st.getVang() ); 
	  }
	
}
