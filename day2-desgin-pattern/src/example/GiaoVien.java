package example;

public class GiaoVien {
	private String ten;

	public GiaoVien(String ten) {
		this.ten = ten;
	}

	public void thayDoiDiem(HocSinh hocSinh, int diemMoi, PhuHuynh phuHuynh) {
		hocSinh.setDiem(diemMoi);
		System.out.println(ten + " đã thay đổi điểm của " + hocSinh.getTen() + " thành " + diemMoi);
		phuHuynh.nhanThongBao("Điểm số của con bạn (" + hocSinh.getTen() + ") đã thay đổi thành: " + diemMoi);
	}
}
