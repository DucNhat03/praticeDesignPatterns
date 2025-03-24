package exercise02;

import java.util.ArrayList;
import java.util.List;

public class CongViec implements ChuThe {
	private List<NguoiQuanSat> danhSachThanhVien = new ArrayList<>();
	private String tenCongViec;
	private String trangThai;

	public CongViec(String tenCongViec, String trangThai) {
		this.tenCongViec = tenCongViec;
		this.trangThai = trangThai;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void thayDoiTrangThai(String trangThaiMoi) {
		this.trangThai = trangThaiMoi;
		thongBaoNguoiQuanSat("Công việc " + tenCongViec + " thay đổi trạng thái thành: " + trangThaiMoi);
	}

	@Override
	public void dangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachThanhVien.add(nguoiQuanSat);
	}

	@Override
	public void huyDangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachThanhVien.remove(nguoiQuanSat);
	}

	@Override
	public void thongBaoNguoiQuanSat(String thongBao) {
		for (NguoiQuanSat nguoiQuanSat : danhSachThanhVien) {
			nguoiQuanSat.capNhat(thongBao);
		}
	}
}
