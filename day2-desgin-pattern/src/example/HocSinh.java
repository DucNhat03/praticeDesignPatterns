package example;

public class HocSinh {
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

	public void setDiem(int diem) {
		this.diem = diem;
	}
}
