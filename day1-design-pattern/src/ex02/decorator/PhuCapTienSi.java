package ex02.decorator;

public class PhuCapTienSi extends PhuCapDecorator {
	public PhuCapTienSi(NhanVien nhanVien) {
		super(nhanVien);
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() + 500;
	}

	@Override
	public String moTa() {
		return super.moTa() + " + Phụ cấp Tiến sĩ";
	}
}
