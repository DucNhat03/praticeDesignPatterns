package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		String store = "CellphoneS";
		
		Compose_Phone ThuDuc = new Compose_Phone("Thu Duc City", 0);
		System.out.println(">>> Cua hang dien thoai " + store+" <<<");
		
		
		Leaf_Phone chiNhanh1 = new Leaf_Phone("Le Van Viet", 50000000);
		Leaf_Phone chiNhanh2 = new Leaf_Phone("Kha Van Can", 80000000);
		
		System.out.println("-----------------------------------------");
		
		
		ThuDuc.addPhone(chiNhanh1);
		ThuDuc.addPhone(chiNhanh2);
		
		int tongDoanhThuTrongNgay = ThuDuc.totalPhone();
		
		System.out.println("Doanh thu trong ngay tai  "+"<< "+ ThuDuc.name +" >> " +"ngay 27/03/2025 la: "+ tongDoanhThuTrongNgay);
		System.out.println("-----------------------------------------");
		System.out.println("Chi tiet danh thu");
		
		ThuDuc.showList();
		
		Leaf_Phone chiNhanh3 = new Leaf_Phone("Tang Nhon Phu", 55000000);
		ThuDuc.addPhone(chiNhanh3);
		ThuDuc.removePhone(chiNhanh2);
		
		System.out.println("THONG BAO !!! Chi nhanh 2 ngung hoat dong !!!");
		int newDoanhThu = ThuDuc.totalPhone();
		
		
		System.out.println("Doanh thu trong ngay tai  "+"<< "+ ThuDuc.name +" >> " +" la: "+ newDoanhThu);
		System.out.println("-----------------------------------------");
		System.out.println("Chi tiet danh thu");
		ThuDuc.showList();
		
	}

}
