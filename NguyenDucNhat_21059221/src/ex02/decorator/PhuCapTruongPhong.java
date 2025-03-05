package ex02.decorator;

public class PhuCapTruongPhong extends PhuCapDecorator {
	public PhuCapTruongPhong(NhanVien nhanVien) {
		super(nhanVien);
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() + 700;
	}

	@Override
	public String moTa() {
		return super.moTa() + " + Phụ cấp Trưởng phòng";
	}
}
