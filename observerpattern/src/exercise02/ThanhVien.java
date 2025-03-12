package exercise02;

public class ThanhVien implements NguoiQuanSat {
	 private String ten;

	 public ThanhVien(String ten) {
	     this.ten = ten;
	 }

	 @Override
	 public void capNhat(String thongBao) {
	     System.out.println(ten + " nhận thông báo: " + thongBao);
	 }
	}

	class QuanLyCongViec {
	 public void capNhatTrangThai(CongViec congViec, String trangThaiMoi) {
	     System.out.println("Cập nhật trạng thái công việc: " + congViec.getTenCongViec() + " thành " + trangThaiMoi);
	     congViec.thayDoiTrangThai(trangThaiMoi);
	 }
	}
