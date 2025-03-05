package ex02.decorator;

public abstract class PhuCapDecorator implements NhanVien {
	protected NhanVien nhanVien;

	public PhuCapDecorator(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	@Override
	public double tinhLuong() {
		return nhanVien.tinhLuong();
	}

	@Override
	public String moTa() {
		return nhanVien.moTa();
	}
}
