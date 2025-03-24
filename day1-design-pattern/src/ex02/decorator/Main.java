package ex02.decorator;

public class Main {
	public static void main(String[] args) {
		NhanVien nhanVien = new NhanVienCoBan("Nhật", 2000);
		System.out.println(nhanVien.moTa() + ": " + nhanVien.tinhLuong() + " USD");

		// Thêm phụ cấp Tiến sĩ
		nhanVien = new PhuCapTienSi(nhanVien);
		System.out.println(nhanVien.moTa() + ": " + nhanVien.tinhLuong() + " USD");

		// Thêm phụ cấp Trưởng phòng
		nhanVien = new PhuCapTruongPhong(nhanVien);
		System.out.println(nhanVien.moTa() + ": " + nhanVien.tinhLuong() + " USD");
		
		
		
	}
}
