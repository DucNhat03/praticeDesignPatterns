package example;

public class PhuHuynh {
	private String ten;

	public PhuHuynh(String ten) {
		this.ten = ten;
	}

	public void nhanThongBao(String thongBao) {
		System.out.println(ten + " nhận thông báo: " + thongBao);
	}
}
