package exercise01;

public class Main {
	public static void main(String[] args) {
		CoPhieu coPhieu = new CoPhieu("ABC", 100.0);
		NhaDauTu nhaDauTu1 = new NhaDauTu("Nguyen Van A");
		NhaDauTu nhaDauTu2 = new NhaDauTu("Nguyen Thi B");
		NhaDauTu nhaDauTu3 = new NhaDauTu("Nguyen Van D");
		NhaDauTu nhaDauTu4 = new NhaDauTu("Nguyen Thi E");
		
		// dang ky nha dau tu		
		coPhieu.dangKy(nhaDauTu1);
		coPhieu.dangKy(nhaDauTu2);
		coPhieu.dangKy(nhaDauTu3);
		coPhieu.dangKy(nhaDauTu4);
		
		// thay doi gia co phieu
		System.out.println("---------------- Thay doi gia co phieu lan 1 ----------------");
		coPhieu.thayDoiGia(111.0);
		
		// thay doi gia co phieu
		System.out.println("---------------- Thay doi gia co phieu lan 2 ----------------");
		coPhieu.thayDoiGia(999.0);
	}

}
