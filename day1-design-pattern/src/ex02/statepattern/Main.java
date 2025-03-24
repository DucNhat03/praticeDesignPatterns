package ex02.statepattern;

public class Main {
	public static void main(String[] args) {
		// Tạo nhân viên với trạng thái mặc định (không có phụ cấp)
		NhanVienState nhanVien = new NhanVienState("Nhật", 2000);
		nhanVien.inLuong();

		// Thay đổi trạng thái sang Tiến sĩ
		nhanVien.thayDoiTrangThai(new TrangThaiTienSi());
		nhanVien.inLuong();

		// Chuyển sang trạng thái Trưởng Phòng
		nhanVien.thayDoiTrangThai(new TrangThaiTruongPhong());
		nhanVien.inLuong();
	}

}
