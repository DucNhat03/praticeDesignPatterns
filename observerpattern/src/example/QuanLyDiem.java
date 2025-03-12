package example;

public class QuanLyDiem {
	public static void main(String[] args) {
		HocSinh hocSinh = new HocSinh("Nguyễn Văn A", 8);
		PhuHuynh phuHuynh = new PhuHuynh("Bố Nguyễn Văn A");
		GiaoVien giaoVien = new GiaoVien("Cô Hoa");

		giaoVien.thayDoiDiem(hocSinh, 9, phuHuynh);
		giaoVien.thayDoiDiem(hocSinh, 7, phuHuynh);
	}
}
