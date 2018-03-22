package oop;
import java.util.*;
public class mainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  ListKhachHang listKh = new ListKhachHang();
	  Scanner in = new Scanner(System.in);
	  int x;
	
	  do
	  {
		  System.out.println("/n/t/t/t-----------------------------------/n");
		  System.out.println("/t/t/t/t 0. thoát ứng dụng/t/t/t");
		  System.out.println("/t/t/t/t 1. thêm khách hàng việt/t/t/t");
		  System.out.println("/t/t/t/t 2. thêm khách hàng nước ngoài/t/t/t");
		  System.out.println("/t/t/t/t 3. Hiển thị danh sách của khách hàng/t/t/t);
		  System.out.println("/t/t/t/t 4. Xem tổng (kW) của các KH/t/t/t");
		  System.out.println("/t/t/t/t 5. Xem TB thành tiền của khách nước ngoài/t/t/t");
		  System.out.println("/n/t/t/t-----------------------------------/n");
		
		  x = in.nextInt();
		  System.out.println("============>>>");
		  switch(x)
		  {
		  case 1:
			  listKh.themKhachHang(1);break;
		  case 2:
			  listKh.themKhachHang(2);break;
		  case 3:
			  listKh.hienthiKH();break;
		  case 4:
			  listKh.TongSL();break;
		  case 5:
			  listKh.trungBinh();break;
		  }
	  }while(x!=0);
	  System.out.println(" ");
	}
}

