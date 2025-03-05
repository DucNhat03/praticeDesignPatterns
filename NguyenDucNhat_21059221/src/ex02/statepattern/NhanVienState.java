package ex02.statepattern;

//Lớp nhân viên có trạng thái động
public class NhanVienState {
	private String ten;
	private double luongCoBan;
	private TrangThaiNhanVien trangThai;

	public NhanVienState(String ten, double luongCoBan) {
		this.ten = ten;
		this.luongCoBan = luongCoBan;
		this.trangThai = new TrangThaiMacDinh(); // Trạng thái mặc định
	}

	public void thayDoiTrangThai(TrangThaiNhanVien trangThaiMoi) {
		this.trangThai = trangThaiMoi;
	}

	public double tinhLuong() {
		return trangThai.tinhLuong(luongCoBan);
	}

	public void inLuong() {
		System.out.println(ten + " nhận được " + tinhLuong() + " USD");
	}
}
