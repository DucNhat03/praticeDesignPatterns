package ex02.statepattern;

public interface TrangThaiNhanVien {

	void thayDoiChucVu(NhanVienState nhanVien, TrangThaiNhanVien trangThaiMoi);

	double tinhLuong(double luongCoBan);

}
