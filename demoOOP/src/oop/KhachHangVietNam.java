package oop;
import java.util.*;
public class KhachHangVietNam extends KhachHang 
{
	Scanner in = new Scanner(System.in);
  private int loaiKH, dinhMuc;
  
  public KhachHangVietNam()
  {
	  super();
	  this.loaiKH=0;
	  this.dinhMuc=0;
  }
  
  public KhachHangVietNam(int ma, int so, double gia, double tien, String ten, String ngay, int loai, int muc)
  {
	  super(ma, so, gia, tien, ten, ngay);
	  this.dinhMuc=muc;
	  this.loaiKH=loai;
  }

  public int getLoaiKH() 
  {
	  return loaiKH;
  }  

  public void setLoaiKH(int loaiKH)
  {
	  this.loaiKH = loaiKH;
  }

  public int getDinhMuc() 
  {
	  return dinhMuc;
  }

  public void setDinhMuc(int dinhMuc) 
  {
	  this.dinhMuc = dinhMuc;
  }
  
  public void nhap()
  {
	  super.nhap();
	  System.out.println("Loai khach hang/n 1.Sinh Hoat/n 2.Kinh Doanh/n3.Sản Xuất");
	  loaiKH = in.nextInt();
	  System.out.println("Định mức: ");
	  dinhMuc = in.nextInt();
  }
  
  public double thanhTien()
  {
	  if(soLuong <= dinhMuc)
	  {
		  return this.thanhTien = this.soLuong*this.donGia;
	  }
	  else
	  {
		  return this.thanhTien = this.soLuong*this.donGia*this.dinhMuc +(this.soLuong - this.dinhMuc)*this.donGia*2.5;
	  }
  }
  
  public String toString()
  {
	  String temp;
	  if(loaiKH == 1)
	  {
		  temp = "Sinh Hoạt";
	  }
	  else if(loaiKH==2)
	  {
		  temp = "Kinh Doanh";
	  }
	  else
	  {
		  temp = "Sản Xuất";
	  }
	  return "Khách hàng Việt Nam: " + super.toString() + ", loai khách hàng: " + temp + ", định mức: " + dinhMuc;
  }
}
