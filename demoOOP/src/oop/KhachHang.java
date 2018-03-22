package oop;
import java.util.Scanner;
public class KhachHang 
{
  protected int maKH,soLuong;
  protected double donGia,thanhTien;
  protected String tenKH,ngayHD;
  Scanner in = new Scanner(System.in);
  
  protected KhachHang()
  {
	  this.maKH=0;
	  this.donGia=0;
	  this.thanhTien=0;
	  this.soLuong=0;
	  this.tenKH="";
	  this.ngayHD="";
  }
  
  protected KhachHang(int ma, int so, double gia, double tien, String ten, String ngay)
  {
	  this.maKH=ma;
	  this.donGia=gia;
	  this.soLuong=so;
	  this.thanhTien=tien;
	  this.tenKH=ten;
	  this.ngayHD=ngay;
  }
  public int getMaKH() 
  {
      return maKH;
  }
  
  public void setMaKH(int maKH) 
  {
	  this.maKH = maKH;
  }
  
  public int getSoLuong() 
  {
	  return soLuong;
  }
  
public void setSoLuong(int soLuong) 
  {
	  this.soLuong = soLuong;
  }

  public double getDonGia() 
  {
	  return donGia;
  }

  public void setDonGia(double donGia)
  {
	  this.donGia = donGia;
  }

  public double getThanhTien() 
  {
	  return thanhTien;
  }

  public void setThanhTien(double thanhTien)
  {
	  this.thanhTien = thanhTien;
  }  

  public String getTenKH() 
  {
	  return tenKH;
  }
  
  public void setTenKH(String tenKH) 
  {
	  this.tenKH = tenKH;
  }

  public String getNgayHD() 
  {
	  return ngayHD;
  }

  public void setNgayHD(String ngayHD) 
  {
	  this.ngayHD = ngayHD;
  }
  
  protected void nhap()
  {
	  System.out.println("Nhập mã khách hàng: ");
	  maKH = in.nextInt();
	  System.out.println("Đơn giá: ");
	  donGia = in.nextDouble();
	  System.out.println("Số lượng (kW): ");
	  soLuong = in.nextInt();
	  System.out.println("Nhập tên khách hàng: ");
	  tenKH = in.next();
	  System.out.println("Ngày lập hóa đơn: ");
	  ngayHD = in.next();
  }
  
  public String toString()
  {
	  return "[maKH: " + maKH + ", Tên khách hàng: " + tenKH + ", Số lượng (kW): " + soLuong + ", ngày hóa đơn: " + ngayHD + "Đơn giá: " + donGia + "]";
  }
}
