package ex02.nopattern;

public class NoUsePattern {

	private String ten;
	private double luongCoBan;
	private ChucVu chucVu;

	public NoUsePattern(String ten, double luongCoBan, ChucVu chucVu) {
		this.ten = ten;
		this.luongCoBan = luongCoBan;
		this.chucVu = chucVu;
	}

	public double tinhLuong() {
		return luongCoBan + chucVu.getPhuCap();
	}

	public void inLuong() {
		System.out.println(ten + " nhận được " + tinhLuong() + " USD (" + chucVu + ")");
	}

	// main test
	public static void main(String[] args) {
		// ví dụ lương cơ bản là 1000 USD và có chức vụ là PHU_CAP_TIEN_SI
		NoUsePattern nup = new NoUsePattern("Nhật", 1000, ChucVu.PHU_CAP_TIEN_SI);
		nup.inLuong();

	}
}
