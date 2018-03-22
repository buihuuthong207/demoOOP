package oop;
import oop.KhachHang;
public class ListKhachHang 
{
  KhachHang kh[] = new KhachHang[100];
  private int countKH, sum1 = 0, sum2 = 0, sumtien = 0 ,dem = 0;
  
  public ListKhachHang()
  {
	  countKH=0;
	  for(int i=0; i<100; i++)
	  {
		  kh[i] = new KhachHang();
	  }
  }
  
  public void themKhachHang(int temp)
  {
	  if(countKH > 100)
	  {
		  System.out.println("Bộ nhớ đã đầy!!!!!!!");
	  }
	  else
	  {
		  if(temp == 1)
		  {
			  kh[countKH] = new KhachHangVietNam();
			  KhachHangVietNam khv = new KhachHangVietNam();
			  khv.nhap();
			  khv.thanhTien = khv.thanhTien();
			  kh[countKH] = khv;
			  sum1 += khv.soLuong;
		  }
		  else
		  {
			  kh[countKH] = new KhachNuocNgoai();
			  KhachNuocNgoai khnn = new KhachNuocNgoai();
			  khnn.nhap();
			  khnn.thanhTien = khnn.thanhTien();
			  kh[countKH] = khnn;
			  sum2 += khnn.soLuong;
			  sumtien += khnn.thanhTien;
			  dem ++; //lưu số lượng khách hàng nước ngoài
		  }
		  countKH ++;
	  }
  }
  
  public void hienthiKH()
  {
	  for(int i=0; i < countKH; i ++)
	  {
		  	System.out.println("Số thứ tự: " + i +1);
		  	System.out.println(kh[i].toString());
	  }
  }
  
  public void TongSL()
  {
	  System.out.println("Tổng số lượng điện của KH Việt: " + sum1);
	  System.out.println("Tổng số lượng điện của KH nước ngoài: " +sum2);
  }
  
  public void trungBinh()
  {
	  System.out.println("trung binh thành tiền của khách nước ngoài: " + (sumtien/dem));
  }
}
