package exercise01;

import java.util.ArrayList;
import java.util.List;

public class CoPhieu implements ChuThe {
	private List<NguoiQuanSat> danhSachNhaDauTu = new ArrayList<>();
	private String tenCoPhieu;
	private double gia;

	public CoPhieu(String tenCoPhieu, double gia) {
		this.tenCoPhieu = tenCoPhieu;
		this.gia = gia;
	}

	public void thayDoiGia(double giaMoi) {
		this.gia = giaMoi;
		thongBaoNguoiQuanSat("Giá cổ phiếu " + tenCoPhieu + " thay đổi thành: " + giaMoi);
	}

	@Override
	public void dangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachNhaDauTu.add(nguoiQuanSat);
	}

	@Override
	public void huyDangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachNhaDauTu.remove(nguoiQuanSat);
	}

	@Override
	public void thongBaoNguoiQuanSat(String thongBao) {
		for (NguoiQuanSat nguoiQuanSat : danhSachNhaDauTu) {
			nguoiQuanSat.capNhat(thongBao);
		}
	}
}
