package oop;

class KhachNuocNgoai extends KhachHang 
{
  private String quocTich;
  
  public KhachNuocNgoai()
  {
	  super();
	  this.quocTich="";
  }
  
  public KhachNuocNgoai(int ma, int so, double gia, double tien, String ten, String ngay, String qt)
  {
	  super(ma, so, gia, tien, ten, ngay);
	  this.quocTich = qt;
  }

  public String getQuocTich() 
  {
	  return quocTich;
  }

  public void setQuocTich(String quocTich) 
  {
	  this.quocTich = quocTich;
  }
  
  public void nhap()
  {
	  super.nhap();
	  System.out.println("Quốc tich: ");
	  quocTich = in.next();
  }
  
  public double thanhTien()
  {
	  return this.thanhTien = this.soLuong*this.donGia;
  }
  
  public String toString()
  {
	  return "Khách nước ngoài: " + super.toString() + ", Quốc tịch: " + quocTich + ", thành tiền: " + this.thanhTien;
  }
  
}
