package ex02.statepattern;

public class TrangThaiTruongPhong implements TrangThaiNhanVien {
	@Override
	public void thayDoiChucVu(NhanVienState nhanVien, TrangThaiNhanVien trangThaiMoi) {
		nhanVien.thayDoiTrangThai(trangThaiMoi);
	}

	@Override
	public double tinhLuong(double luongCoBan) {
		return luongCoBan + 700; // Phụ cấp Trưởng phòng
	}
}
