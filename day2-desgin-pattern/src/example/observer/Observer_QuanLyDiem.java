package example.observer;

import java.util.ArrayList;
import java.util.List;

class HocSinh implements ChuThe {
	private List<NguoiQuanSat> danhSachPhuHuynh = new ArrayList<>();
	private String ten;
	private int diem;

	public HocSinh(String ten, int diem) {
		this.ten = ten;
		this.diem = diem;
	}

	public String getTen() {
		return ten;
	}
	
	public int getDiem() {
		return diem;
	}

	public void thayDoiDiem(int diemMoi) {
		this.diem = diemMoi;
		thongBaoNguoiQuanSat("Điểm số của " + ten + " đã thay đổi thành: " + diemMoi);
	}

	@Override
	public void dangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachPhuHuynh.add(nguoiQuanSat);
	}

	@Override
	public void huyDangKy(NguoiQuanSat nguoiQuanSat) {
		danhSachPhuHuynh.remove(nguoiQuanSat);
	}

	@Override
	public void thongBaoNguoiQuanSat(String thongBao) {
		for (NguoiQuanSat nguoiQuanSat : danhSachPhuHuynh) {
			nguoiQuanSat.capNhat(thongBao);
		}
	}

}

// Phu huynh
class PhuHuynh implements NguoiQuanSat {
	private String ten;

	public PhuHuynh(String ten) {
		this.ten = ten;
	}

	@Override
	public void capNhat(String thongBao) {
		System.out.println(ten + " nhận thông báo: " + thongBao);
	}
}

// Giao vien
class GiaoVien {
	private String ten;

	public GiaoVien(String ten) {
		this.ten = ten;
	}

	public void thayDoiDiem(HocSinh hocSinh, int diemMoi) {
		System.out.println(ten + " đã thay đổi điểm của " + hocSinh.getTen() + " thành " + diemMoi);
		hocSinh.thayDoiDiem(diemMoi); 
	}
}

// test
public class Observer_QuanLyDiem {
	public static void main(String[] args) {
		HocSinh hocSinh = new HocSinh("Nguyễn Văn A", 8);
		System.out.println("Học sinh: " + hocSinh.getTen() + " - Điểm: " + hocSinh.getDiem());
		PhuHuynh phuHuynh1 = new PhuHuynh("Bố Nguyễn Văn A");
		PhuHuynh phuHuynh2 = new PhuHuynh("Mẹ Nguyễn Văn A");

		hocSinh.dangKy(phuHuynh1);
		hocSinh.dangKy(phuHuynh2);

		GiaoVien giaoVien = new GiaoVien("Cô Hoa");
		giaoVien.thayDoiDiem(hocSinh, 10);
		GiaoVien giaoVien2 = new GiaoVien("Cô Thắm");
		giaoVien2.thayDoiDiem(hocSinh, 5);
	}
}
