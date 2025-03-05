package ex02.decorator;

public class NhanVienCoBan implements NhanVien {
	private String ten;
	private double luongCoBan;

	public NhanVienCoBan(String ten, double luongCoBan) {
		this.ten = ten;
		this.luongCoBan = luongCoBan;
	}

	@Override
	public double tinhLuong() {
		return luongCoBan;
	}

	@Override
	public String moTa() {
		return "Nhân viên: " + ten;
	}
}
