package ex02.statepattern;

public class TrangThaiTienSi implements TrangThaiNhanVien {
	@Override
	public void thayDoiChucVu(NhanVienState nhanVien, TrangThaiNhanVien trangThaiMoi) {
		nhanVien.thayDoiTrangThai(trangThaiMoi);
	}

	@Override
	public double tinhLuong(double luongCoBan) {
		return luongCoBan + 500; // Phụ cấp Tiến sĩ
	}
}
