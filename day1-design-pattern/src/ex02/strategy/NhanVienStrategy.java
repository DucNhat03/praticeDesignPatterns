package ex02.strategy;

public class NhanVienStrategy {
	private String ten;
	private double luongCoBan;
	private ChienLuocPhuCap chienLuocPhuCap;

	public NhanVienStrategy(String ten, double luongCoBan) {
		this.ten = ten;
		this.luongCoBan = luongCoBan;
		this.chienLuocPhuCap = new KhongCoPhuCap(); // Mặc định không có phụ cấp
	}

	public void setChienLuocPhuCap(ChienLuocPhuCap chienLuocPhuCap) {
		this.chienLuocPhuCap = chienLuocPhuCap;
	}

	public double tinhLuong() {
		return luongCoBan + chienLuocPhuCap.tinhPhuCap();
	}

	public void inLuong() {
		System.out.println(ten + " nhận được " + tinhLuong() + " USD");
	}
}
