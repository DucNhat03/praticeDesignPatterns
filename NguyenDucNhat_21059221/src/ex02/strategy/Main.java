package ex02.strategy;

public class Main {
	public static void main(String[] args) {
		// Tạo nhân viên mặc định (không có phụ cấp)
		NhanVienStrategy nhanVien = new NhanVienStrategy("Nhật", 2000);
		nhanVien.inLuong();

		// Thay đổi chiến lược sang Tiến sĩ
		nhanVien.setChienLuocPhuCap(new PhuCapTienSi());
		nhanVien.inLuong();

		// Chuyển sang chiến lược Trưởng Phòng
		nhanVien.setChienLuocPhuCap(new PhuCapTruongPhong());
		nhanVien.inLuong();
	}

}
