package exercise02;

public class Main {
	public static void main(String[] args) {
		CongViec congViec = new CongViec("Phát triển giao diện", "Đang thực hiện");
		ThanhVien thanhVien1 = new ThanhVien("Nguyễn Văn C");
		ThanhVien thanhVien2 = new ThanhVien("Trần Thị D");
		ThanhVien thanhVien3 = new ThanhVien("Đinh Văn T");

		// dang ky thanh vien
		congViec.dangKy(thanhVien1);
		congViec.dangKy(thanhVien2);
		congViec.dangKy(thanhVien3);

		QuanLyCongViec quanLy = new QuanLyCongViec();
		System.out.println("-------------- Cập nhật trạng thái công việc --------------");
		quanLy.capNhatTrangThai(congViec, "Hoàn thành");
		System.out.println("-------------- Cập nhật trạng thái công việc --------------");
		quanLy.capNhatTrangThai(congViec, "Đang bảo trì");
	}
}
