package composite;

import java.util.ArrayList;
import java.util.List;

// Component
interface ThanhPhan {
	double tinhGia();
}

// Lớp Leaf
class SanPham implements ThanhPhan {
	private String ten;
	private double gia;

	public SanPham(String ten, double gia) {
		this.ten = ten;
		this.gia = gia;
	}

	@Override
	public double tinhGia() {
		return gia;
	}

	@Override
	public String toString() {
		return ten + ": " + gia + " VND";
	}
}

// Composite 
class Ban implements ThanhPhan {
	private List<ThanhPhan> danhSachSanPham = new ArrayList<>();

	public void themSanPham(ThanhPhan sanPham) {
		danhSachSanPham.add(sanPham);
	}
	
	public void xemSanPham() {
		danhSachSanPham.forEach(System.out::println);
	}

	@Override
	public double tinhGia() {
		return danhSachSanPham.stream().mapToDouble(ThanhPhan::tinhGia).sum();
	}
}

// Lớp Composite QuanCaPhe chua cac Ban
class QuanCaPhe implements ThanhPhan {
	private List<ThanhPhan> danhSachBan = new ArrayList<>();

	public void themBan(ThanhPhan ban) {
		danhSachBan.add(ban);
	}

	@Override
	public double tinhGia() {
		double gia = 0;
		for (ThanhPhan ban : danhSachBan) {
			gia += ban.tinhGia();
		}
		return gia;
	}
}

// Main
public class Composite_QuanCaPhe {
	public static void main(String[] args) {
		// Tạo sản phẩm
		SanPham caPhe = new SanPham("Cà phê", 20000);
		SanPham nuocSuoi = new SanPham("Nước suối", 10000);
		SanPham traSua = new SanPham("Trà sữa", 30000);

		// ban so 1
		Ban ban1 = new Ban();
		System.out.println("Danh sách sản phẩm ban 1: ");
		ban1.themSanPham(caPhe);
		ban1.themSanPham(nuocSuoi);
		ban1.themSanPham(traSua);
		ban1.xemSanPham();
		
		// ban so 2
		Ban ban2 = new Ban();
		System.out.println("Danh sách sản phẩm ban 2: ");
		ban2.themSanPham(traSua);
		ban2.themSanPham(caPhe);
		ban2.xemSanPham();

		// quan ca phe
		QuanCaPhe quan = new QuanCaPhe();
		quan.themBan(ban1);
		quan.themBan(ban2);

		// Tong doanh thu
		System.out.println("Tổng doanh thu quán cà phê: " + quan.tinhGia() + " VND");
	}
}