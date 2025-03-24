package ex02.statepattern;

public class TrangThaiMacDinh implements TrangThaiNhanVien {
	@Override
	public void thayDoiChucVu(NhanVienState nhanVien, TrangThaiNhanVien trangThaiMoi) {
		nhanVien.thayDoiTrangThai(trangThaiMoi);
	}

	@Override
	public double tinhLuong(double luongCoBan) {
		return luongCoBan; // Không có phụ cấp
	}
}
