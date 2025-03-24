package ex02.nopattern;

public enum ChucVu {
	KHONG_CO_PHU_CAP(0),
	PHU_CAP_TIEN_SI(500),
	PHU_CAP_TO_TRUONG(300),
	PHU_CAP_TRUONG_PHONG(700);

	private final double phuCap;

	ChucVu(double phuCap) {
		this.phuCap = phuCap;
	}

	public double getPhuCap() {
		return phuCap;
	}
}
