package exercise01;

class NhaDauTu implements NguoiQuanSat {
	private String ten;

	public NhaDauTu(String ten) {
		this.ten = ten;
	}

	@Override
	public void capNhat(String thongBao) {
		System.out.println(ten + " nhận thông báo: " + thongBao);
	}
}

